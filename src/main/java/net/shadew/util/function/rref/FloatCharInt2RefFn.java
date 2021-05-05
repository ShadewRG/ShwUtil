package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and an {@code int} and returns an object.
 */
public interface FloatCharInt2RefFn<R> {
    R invoke(float p1, char p2, int p3);
}
