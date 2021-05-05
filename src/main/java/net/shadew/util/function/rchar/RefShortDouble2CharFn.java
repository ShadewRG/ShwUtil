package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code short} and a {@code double} and returns a {@code char}.
 */
public interface RefShortDouble2CharFn<P1> {
    char invoke(P1 p1, short p2, double p3);
}