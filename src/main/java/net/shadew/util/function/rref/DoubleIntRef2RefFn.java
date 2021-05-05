package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns an object.
 */
public interface DoubleIntRef2RefFn<P3, R> {
    R invoke(double p1, int p2, P3 p3);
}
