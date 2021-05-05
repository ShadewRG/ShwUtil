package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an {@code int} and a {@code double} and returns a {@code char}.
 */
public interface RefIntDouble2CharFn<P1> {
    char invoke(P1 p1, int p2, double p3);
}
