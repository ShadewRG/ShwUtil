package net.shadew.util.function.rfloat;

/**
 * A function that takes an object and an object and returns a {@code float}.
 */
public interface RefRef2FloatFn<P1, P2> {
    float invoke(P1 p1, P2 p2);
}
