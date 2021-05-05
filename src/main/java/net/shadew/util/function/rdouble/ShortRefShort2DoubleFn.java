package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, an object and a {@code short} and returns a {@code double}.
 */
public interface ShortRefShort2DoubleFn<P2> {
    double invoke(short p1, P2 p2, short p3);
}
