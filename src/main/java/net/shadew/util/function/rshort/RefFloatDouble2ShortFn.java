package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code float} and a {@code double} and returns a {@code short}.
 */
public interface RefFloatDouble2ShortFn<P1> {
    short invoke(P1 p1, float p2, double p3);
}