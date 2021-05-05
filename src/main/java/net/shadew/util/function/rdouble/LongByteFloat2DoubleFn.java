package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code float} and returns a {@code double}.
 */
public interface LongByteFloat2DoubleFn {
    double invoke(long p1, byte p2, float p3);
}