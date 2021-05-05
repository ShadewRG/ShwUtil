package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code byte} and returns a {@code double}.
 */
public interface CharFloatByte2DoubleFn {
    double invoke(char p1, float p2, byte p3);
}