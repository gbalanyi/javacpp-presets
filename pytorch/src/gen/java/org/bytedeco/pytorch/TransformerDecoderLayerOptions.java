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



// ============================================================================

/** Options for the {@code TransformerDecoderLayer} module.
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerDecoderLayer model(TransformerDecoderLayerOptions(512, 8).dropout(0.2));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerDecoderLayerOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerDecoderLayerOptions(Pointer p) { super(p); }


  public TransformerDecoderLayerOptions(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead) { super((Pointer)null); allocate(d_model, nhead); }
  private native void allocate(@Cast("int64_t") long d_model, @Cast("int64_t") long nhead);
  public native @Cast("int64_t*") @ByRef @NoException LongPointer d_model();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer nhead();
  public native @Cast("int64_t*") @ByRef @NoException LongPointer dim_feedforward();
  public native @ByRef @NoException DoublePointer dropout();
  public native @ByRef @NoException transformer_activation_t activation();
}
