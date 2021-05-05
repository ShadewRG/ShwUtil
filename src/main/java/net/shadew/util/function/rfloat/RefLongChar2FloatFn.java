package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code long} and a {@code char} and returns a {@code float}.
 */
public interface RefLongChar2FloatFn<P1> {
    float invoke(P1 p1, long p2, char p3);
}
