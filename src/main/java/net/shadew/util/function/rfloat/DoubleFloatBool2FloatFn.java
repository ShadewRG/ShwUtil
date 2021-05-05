package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code boolean} and returns a {@code float}.
 */
public interface DoubleFloatBool2FloatFn {
    float invoke(double p1, float p2, boolean p3);
}