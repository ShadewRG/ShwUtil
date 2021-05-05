package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code char} and an object and returns a {@code double}.
 */
public interface ShortCharRef2DoubleFn<P3> {
    double invoke(short p1, char p2, P3 p3);
}