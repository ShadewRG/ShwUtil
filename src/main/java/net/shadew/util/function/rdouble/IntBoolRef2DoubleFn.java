package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns a {@code double}.
 */
public interface IntBoolRef2DoubleFn<P3> {
    double invoke(int p1, boolean p2, P3 p3);
}
