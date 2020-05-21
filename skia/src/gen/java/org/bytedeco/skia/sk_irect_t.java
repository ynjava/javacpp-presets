// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_irect_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_irect_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_irect_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_irect_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_irect_t position(long position) {
        return (sk_irect_t)super.position(position);
    }

    public native int left(); public native sk_irect_t left(int setter);
    public native int top(); public native sk_irect_t top(int setter);
    public native int right(); public native sk_irect_t right(int setter);
    public native int bottom(); public native sk_irect_t bottom(int setter);
}
