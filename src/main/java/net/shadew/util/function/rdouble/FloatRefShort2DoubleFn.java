package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, an object and a {@code short} and returns a {@code double}.
 */
public interface FloatRefShort2DoubleFn<P2> {
    double invoke(float p1, P2 p2, short p3);
}