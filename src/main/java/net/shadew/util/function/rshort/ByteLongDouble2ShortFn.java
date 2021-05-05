package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code double} and returns a {@code short}.
 */
public interface ByteLongDouble2ShortFn {
    short invoke(byte p1, long p2, double p3);
}