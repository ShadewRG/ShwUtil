package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, an object and a {@code short} and returns a {@code double}.
 */
public interface RefRefShort2DoubleFn<P1, P2> {
    double invoke(P1 p1, P2 p2, short p3);
}