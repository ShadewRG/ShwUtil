package net.shadew.util.function.rdouble;

/**
 * A function that takes an object and a {@code byte} and returns a {@code double}.
 */
public interface RefByte2DoubleFn<P1> {
    double invoke(P1 p1, byte p2);
}