package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code float} and returns an object.
 */
public interface FloatShortFloat2RefFn<R> {
    R invoke(float p1, short p2, float p3);
}
