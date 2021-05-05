package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an object and a {@code float} and returns a {@code float}.
 */
public interface ShortRefFloat2FloatFn<P2> {
    float invoke(short p1, P2 p2, float p3);
}
