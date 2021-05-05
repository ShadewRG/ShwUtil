package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code double}.
 */
public interface DoubleFloatRef2DoubleFn<P3> {
    double invoke(double p1, float p2, P3 p3);
}
