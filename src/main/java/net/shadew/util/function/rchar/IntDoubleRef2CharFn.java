package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code char}.
 */
public interface IntDoubleRef2CharFn<P3> {
    char invoke(int p1, double p2, P3 p3);
}
