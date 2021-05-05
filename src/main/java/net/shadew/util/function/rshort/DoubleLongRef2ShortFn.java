package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code short}.
 */
public interface DoubleLongRef2ShortFn<P3> {
    short invoke(double p1, long p2, P3 p3);
}
