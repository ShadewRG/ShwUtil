package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns an {@code int}.
 */
public interface FloatRefDouble2IntFn<P2> {
    int invoke(float p1, P2 p2, double p3);
}