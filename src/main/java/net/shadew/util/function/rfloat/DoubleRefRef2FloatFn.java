package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, an object and an object and returns a {@code float}.
 */
public interface DoubleRefRef2FloatFn<P2, P3> {
    float invoke(double p1, P2 p2, P3 p3);
}
