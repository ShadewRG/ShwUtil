package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code double} and returns a {@code float}.
 */
public interface LongFloatDouble2FloatFn {
    float invoke(long p1, float p2, double p3);
}
