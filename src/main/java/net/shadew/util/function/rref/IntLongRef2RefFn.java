package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns an object.
 */
public interface IntLongRef2RefFn<P3, R> {
    R invoke(int p1, long p2, P3 p3);
}
