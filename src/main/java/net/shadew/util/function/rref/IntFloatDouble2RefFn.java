package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code double} and returns an object.
 */
public interface IntFloatDouble2RefFn<R> {
    R invoke(int p1, float p2, double p3);
}
