package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an object and a {@code byte} and returns a {@code double}.
 */
public interface FloatRefByte2DoubleFn<P2> {
    double invoke(float p1, P2 p2, byte p3);
}