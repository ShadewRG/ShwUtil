package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and an {@code int} and returns an object.
 */
public interface IntLongInt2RefFn<R> {
    R invoke(int p1, long p2, int p3);
}