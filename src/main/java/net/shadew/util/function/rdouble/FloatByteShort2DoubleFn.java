package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code short} and returns a {@code double}.
 */
public interface FloatByteShort2DoubleFn {
    double invoke(float p1, byte p2, short p3);
}