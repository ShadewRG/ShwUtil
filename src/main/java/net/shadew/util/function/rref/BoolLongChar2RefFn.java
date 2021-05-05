package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code char} and returns an object.
 */
public interface BoolLongChar2RefFn<R> {
    R invoke(boolean p1, long p2, char p3);
}
