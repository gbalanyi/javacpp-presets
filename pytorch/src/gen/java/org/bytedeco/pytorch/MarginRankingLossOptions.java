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
 // namespace functional

// ============================================================================

/** Options for the {@code MarginRankingLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  MarginRankingLoss model(MarginRankingLossOptions().margin(0.5).reduction(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MarginRankingLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MarginRankingLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MarginRankingLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MarginRankingLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MarginRankingLossOptions position(long position) {
        return (MarginRankingLossOptions)super.position(position);
    }
    @Override public MarginRankingLossOptions getPointer(long i) {
        return new MarginRankingLossOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException DoublePointer margin();
  public native @ByRef @NoException loss_reduction_t reduction();
}
