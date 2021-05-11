// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorGeometryArg extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorGeometryArg(Pointer p) { super(p); }

  public native @ByRef TensorGeometry tensor(); public native TensorGeometryArg tensor(TensorGeometry setter);
  public native @Cast("const char*") BytePointer name(); public native TensorGeometryArg name(BytePointer setter);
  public native int pos(); public native TensorGeometryArg pos(int setter); // 1-indexed
  /* implicit */ public TensorGeometryArg(@ByVal TensorArg arg) { super((Pointer)null); allocate(arg); }
private native void allocate(@ByVal TensorArg arg);
  public TensorGeometryArg(@ByVal TensorGeometry tensor, @Cast("const char*") BytePointer name, int pos) { super((Pointer)null); allocate(tensor, name, pos); }
  private native void allocate(@ByVal TensorGeometry tensor, @Cast("const char*") BytePointer name, int pos);
  public TensorGeometryArg(@ByVal TensorGeometry tensor, String name, int pos) { super((Pointer)null); allocate(tensor, name, pos); }
  private native void allocate(@ByVal TensorGeometry tensor, String name, int pos);
  public native @Const @Name("operator ->") TensorGeometry access();
  public native @Const @ByRef @Name("operator *") TensorGeometry multiply();
}