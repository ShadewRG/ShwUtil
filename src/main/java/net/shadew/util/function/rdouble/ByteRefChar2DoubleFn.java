package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, an object and a {@code char} and returns a {@code double}.
 */
public interface ByteRefChar2DoubleFn<P2> {
    double invoke(byte p1, P2 p2, char p3);
}
