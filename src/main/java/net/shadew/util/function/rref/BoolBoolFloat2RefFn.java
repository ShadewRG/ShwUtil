package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface BoolBoolFloat2RefFn<R> {
    R invoke(boolean p1, boolean p2, float p3);
}