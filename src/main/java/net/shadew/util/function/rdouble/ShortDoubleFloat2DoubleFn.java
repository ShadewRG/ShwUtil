package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code float} and returns a {@code double}.
 */
public interface ShortDoubleFloat2DoubleFn {
    double invoke(short p1, double p2, float p3);
}