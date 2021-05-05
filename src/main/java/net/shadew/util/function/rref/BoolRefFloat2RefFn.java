package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns an object.
 */
public interface BoolRefFloat2RefFn<P2, R> {
    R invoke(boolean p1, P2 p2, float p3);
}