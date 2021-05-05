package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code long}.
 */
public interface DoubleLongRef2LongFn<P3> {
    long invoke(double p1, long p2, P3 p3);
}
