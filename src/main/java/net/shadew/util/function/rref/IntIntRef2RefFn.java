package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns an object.
 */
public interface IntIntRef2RefFn<P3, R> {
    R invoke(int p1, int p2, P3 p3);
}
