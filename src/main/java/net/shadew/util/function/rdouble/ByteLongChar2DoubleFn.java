package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code char} and returns a {@code double}.
 */
public interface ByteLongChar2DoubleFn {
    double invoke(byte p1, long p2, char p3);
}