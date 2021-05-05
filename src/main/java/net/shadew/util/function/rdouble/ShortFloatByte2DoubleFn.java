package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code byte} and returns a {@code double}.
 */
public interface ShortFloatByte2DoubleFn {
    double invoke(short p1, float p2, byte p3);
}
