package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code double}.
 */
public interface LongLongRef2DoubleFn<P3> {
    double invoke(long p1, long p2, P3 p3);
}