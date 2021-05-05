package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code float} and a {@code double} and returns a {@code double}.
 */
public interface RefFloatDouble2DoubleFn<P1> {
    double invoke(P1 p1, float p2, double p3);
}
