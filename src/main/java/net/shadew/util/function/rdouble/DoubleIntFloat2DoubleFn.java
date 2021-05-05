package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an {@code int} and a {@code float} and returns a {@code double}.
 */
public interface DoubleIntFloat2DoubleFn {
    double invoke(double p1, int p2, float p3);
}