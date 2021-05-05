package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code long} and returns an object.
 */
public interface BoolShortLong2RefFn<R> {
    R invoke(boolean p1, short p2, long p3);
}
