package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code boolean} and a {@code long} and returns a {@code float}.
 */
public interface RefBoolLong2FloatFn<P1> {
    float invoke(P1 p1, boolean p2, long p3);
}
