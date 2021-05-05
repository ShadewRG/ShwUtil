package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns a {@code long}.
 */
public interface LongRefInt2LongFn<P2> {
    long invoke(long p1, P2 p2, int p3);
}
