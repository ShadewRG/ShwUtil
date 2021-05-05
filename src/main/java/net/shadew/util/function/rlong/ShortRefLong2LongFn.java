package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, an object and a {@code long} and returns a {@code long}.
 */
public interface ShortRefLong2LongFn<P2> {
    long invoke(short p1, P2 p2, long p3);
}
