package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns a {@code double}.
 */
public interface BoolFloatRef2DoubleFn<P3> {
    double invoke(boolean p1, float p2, P3 p3);
}
