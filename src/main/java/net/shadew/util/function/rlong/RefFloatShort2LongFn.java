package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code float} and a {@code short} and returns a {@code long}.
 */
public interface RefFloatShort2LongFn<P1> {
    long invoke(P1 p1, float p2, short p3);
}