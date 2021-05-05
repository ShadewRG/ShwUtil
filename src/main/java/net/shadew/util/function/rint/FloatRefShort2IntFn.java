package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float}, an object and a {@code short} and returns an {@code int}.
 */
public interface FloatRefShort2IntFn<P2> {
    int invoke(float p1, P2 p2, short p3);
}