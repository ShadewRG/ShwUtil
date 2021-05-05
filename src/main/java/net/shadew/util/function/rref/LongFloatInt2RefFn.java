package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code float} and an {@code int} and returns an object.
 */
public interface LongFloatInt2RefFn<R> {
    R invoke(long p1, float p2, int p3);
}
