package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, an object and an object and returns a {@code long}.
 */
public interface LongRefRef2LongFn<P2, P3> {
    long invoke(long p1, P2 p2, P3 p3);
}