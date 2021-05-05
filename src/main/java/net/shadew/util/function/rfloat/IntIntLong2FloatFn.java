package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code long} and returns a {@code float}.
 */
public interface IntIntLong2FloatFn {
    float invoke(int p1, int p2, long p3);
}