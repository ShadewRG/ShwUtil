package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code float} and returns an object.
 */
public interface IntFloatFloat2RefFn<R> {
    R invoke(int p1, float p2, float p3);
}
