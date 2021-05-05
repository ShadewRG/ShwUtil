package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns a {@code long}.
 */
public interface ShortRefChar2LongFn<P2> {
    long invoke(short p1, P2 p2, char p3);
}
