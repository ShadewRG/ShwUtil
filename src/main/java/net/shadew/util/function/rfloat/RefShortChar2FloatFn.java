package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code short} and a {@code char} and returns a {@code float}.
 */
public interface RefShortChar2FloatFn<P1> {
    float invoke(P1 p1, short p2, char p3);
}