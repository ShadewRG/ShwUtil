package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code short}.
 */
public interface DoubleFloatRef2ShortFn<P3> {
    short invoke(double p1, float p2, P3 p3);
}
