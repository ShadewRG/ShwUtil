package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code char} and returns a {@code float}.
 */
public interface ShortLongChar2FloatFn {
    float invoke(short p1, long p2, char p3);
}