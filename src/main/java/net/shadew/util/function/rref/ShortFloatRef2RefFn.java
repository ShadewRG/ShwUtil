package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns an object.
 */
public interface ShortFloatRef2RefFn<P3, R> {
    R invoke(short p1, float p2, P3 p3);
}
