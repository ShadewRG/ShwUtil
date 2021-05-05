package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, an {@code int} and a {@code double} and returns nothing.
 */
public interface RefIntDouble2VoidFn<P1> {
    void invoke(P1 p1, int p2, double p3);
}