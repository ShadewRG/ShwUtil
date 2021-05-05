package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code boolean} and an {@code int} and returns a {@code float}.
 */
public interface RefBoolInt2FloatFn<P1> {
    float invoke(P1 p1, boolean p2, int p3);
}