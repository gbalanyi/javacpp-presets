// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Declare training operators.

// Iterate over schema from ai.onnx.training version 1
@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class OpSet_OnnxTraining_ver1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OpSet_OnnxTraining_ver1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpSet_OnnxTraining_ver1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpSet_OnnxTraining_ver1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OpSet_OnnxTraining_ver1 position(long position) {
        return (OpSet_OnnxTraining_ver1)super.position(position);
    }
    @Override public OpSet_OnnxTraining_ver1 getPointer(long i) {
        return new OpSet_OnnxTraining_ver1(this).position(position + i);
    }

}
