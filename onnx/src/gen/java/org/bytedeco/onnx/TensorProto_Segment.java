// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorProto_Segment extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorProto_Segment(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorProto_Segment(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorProto_Segment position(long position) {
        return (TensorProto_Segment)super.position(position);
    }
    @Override public TensorProto_Segment getPointer(long i) {
        return new TensorProto_Segment(this).position(position + i);
    }

  public TensorProto_Segment() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorProto_Segment(@Const @ByRef TensorProto_Segment from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorProto_Segment from);

  public native @ByRef @Name("operator =") TensorProto_Segment put(@Const @ByRef TensorProto_Segment from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TensorProto_Segment default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorProto_Segment internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TensorProto_Segment other);
  

  // implements Message ----------------------------------------------

  public native TensorProto_Segment New();

  public native TensorProto_Segment New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorProto_Segment from);
  public native void MergeFrom(@Const @ByRef TensorProto_Segment from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional int64 begin = 1;
  public native @Cast("bool") boolean has_begin();
  public native void clear_begin();
  @MemberGetter public static native int kBeginFieldNumber();
  public static final int kBeginFieldNumber = kBeginFieldNumber();
  public native @Cast("google::protobuf::int64") long begin();
  public native void set_begin(@Cast("google::protobuf::int64") long value);

  // optional int64 end = 2;
  public native @Cast("bool") boolean has_end();
  public native void clear_end();
  @MemberGetter public static native int kEndFieldNumber();
  public static final int kEndFieldNumber = kEndFieldNumber();
  public native @Cast("google::protobuf::int64") long end();
  public native void set_end(@Cast("google::protobuf::int64") long value);
}
