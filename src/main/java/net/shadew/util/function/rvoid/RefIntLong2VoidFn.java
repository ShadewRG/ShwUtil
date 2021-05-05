package net.shadew.util.function.rvoid;

/**
 * A function that takes an object, an {@code int} and a {@code long} and returns nothing.
 */
public interface RefIntLong2VoidFn<P1> {
    void invoke(P1 p1, int p2, long p3);
}