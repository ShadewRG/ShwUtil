package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, an object and a {@code char} and returns a {@code long}.
 */
public interface DoubleRefChar2LongFn<P2> {
    long invoke(double p1, P2 p2, char p3);
}