package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code char} and returns an object.
 */
public interface BoolCharChar2RefFn<R> {
    R invoke(boolean p1, char p2, char p3);
}
