package net.shadew.util.function.rint;

/**
 * A function that takes an {@code int}, an object and a {@code float} and returns an {@code int}.
 */
public interface IntRefFloat2IntFn<P2> {
    int invoke(Int p1, P2 p2, Float p3);
}
