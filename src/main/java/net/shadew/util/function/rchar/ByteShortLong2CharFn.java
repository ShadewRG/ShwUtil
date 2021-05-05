package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code long} and returns a {@code char}.
 */
public interface ByteShortLong2CharFn {
    char invoke(byte p1, short p2, long p3);
}
