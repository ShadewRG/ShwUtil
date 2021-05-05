package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface ShortLongBool2RefFn<R> {
    R invoke(short p1, long p2, boolean p3);
}
