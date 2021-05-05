package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code double} and an {@code int} and returns a {@code double}.
 */
public interface RefDoubleInt2DoubleFn<P1> {
    double invoke(P1 p1, double p2, int p3);
}
