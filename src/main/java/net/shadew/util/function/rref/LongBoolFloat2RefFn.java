package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface LongBoolFloat2RefFn<R> {
    R invoke(long p1, boolean p2, float p3);
}
