package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code char} and returns a {@code byte}.
 */
public interface LongShortChar2ByteFn {
    byte invoke(long p1, short p2, char p3);
}