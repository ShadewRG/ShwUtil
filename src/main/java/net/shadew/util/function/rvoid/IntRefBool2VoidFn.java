package net.shadew.util.function.rvoid;

/**
 * A function that takes an {@code int}, an object and a {@code boolean} and returns nothing.
 */
public interface IntRefBool2VoidFn<P2> {
    void invoke(int p1, P2 p2, boolean p3);
}