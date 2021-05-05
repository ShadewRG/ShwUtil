package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code char} and returns an object.
 */
public interface BoolFloatChar2RefFn<R> {
    R invoke(boolean p1, float p2, char p3);
}