package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code short} and returns a {@code long}.
 */
public interface DoubleFloatShort2LongFn {
    long invoke(double p1, float p2, short p3);
}
