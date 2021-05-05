package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code boolean} and returns a {@code char}.
 */
public interface ShortLongBool2CharFn {
    char invoke(short p1, long p2, boolean p3);
}