package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code float} and an {@code int} and returns a {@code double}.
 */
public interface DoubleFloatInt2DoubleFn {
    double invoke(double p1, float p2, int p3);
}
