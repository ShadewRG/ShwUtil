package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns an {@code int}.
 */
public interface ShortFloatRef2IntFn<P3> {
    int invoke(short p1, float p2, P3 p3);
}
