#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" hyperscan
    popd
    exit
fi

HYPERSCAN_VERSION=5.2.1
BOOST=1_70_0
download "https://github.com/intel/hyperscan/archive/v$HYPERSCAN_VERSION.tar.gz" hyperscan-$HYPERSCAN_VERSION.tar.gz
download http://downloads.sourceforge.net/project/boost/boost/${BOOST//_/.}/boost_$BOOST.tar.gz boost_$BOOST.tar.gz
mkdir -p $PLATFORM
cd $PLATFORM
INSTALL_PATH=`pwd`
mkdir -p include lib
mkdir -p include/hs
echo "Decompressing archives..."
tar -xzvf ../hyperscan-$HYPERSCAN_VERSION.tar.gz
tar --totals -xf ../boost_$BOOST.tar.gz

cd boost_$BOOST
./bootstrap.sh --with-libraries=headers
./b2 headers
cd ..

ln -sf $INSTALL_PATH/boost_$BOOST/boost $INSTALL_PATH/hyperscan-$HYPERSCAN_VERSION/include/boost

cd hyperscan-$HYPERSCAN_VERSION

case $PLATFORM in
    linux-x86_64)
        CFLAGS='-O -fPIC' CC="gcc" CXX="g++ -std=c++11 -m64 -fPIC" "$CMAKE" -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX=$INSTALL_PATH -DCMAKE_INSTALL_LIBDIR="lib"  .
        make -j $MAKEJ
        make install/strip
        ;;
    macosx-x86_64)
        "$CMAKE" -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX=$INSTALL_PATH -DCMAKE_INSTALL_LIBDIR="lib" -DARCH_OPT_FLAGS='-Wno-error' .
        make -j $MAKEJ
        make install/strip
        ;;
    windows-x86_64)
        CXXFLAGS="/Wv:17" "$CMAKE" -G "Visual Studio 15 2017 Win64" -DCMAKE_BUILD_TYPE=Release -DCMAKE_INSTALL_PREFIX="$INSTALL_PATH" -DCMAKE_INSTALL_LIBDIR="lib" -DARCH_OPT_FLAGS='' .
        MSBuild.exe hyperscan.sln //p:Configuration=Release //p:Platform=x64
        cp -r src/* $INSTALL_PATH/include/hs/
        cp lib/*.lib $INSTALL_PATH/lib
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..