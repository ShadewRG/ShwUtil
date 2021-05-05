package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code double}.
 */
public interface LongBoolRef2DoubleFn<P3> {
    double invoke(long p1, boolean p2, P3 p3);
}