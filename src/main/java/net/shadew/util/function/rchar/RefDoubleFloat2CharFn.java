package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code double} and a {@code float} and returns a {@code char}.
 */
public interface RefDoubleFloat2CharFn<P1> {
    char invoke(P1 p1, double p2, float p3);
}