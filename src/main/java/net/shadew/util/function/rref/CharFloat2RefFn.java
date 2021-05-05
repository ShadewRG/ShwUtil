package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code float} and returns an object.
 */
public interface CharFloat2RefFn<R> {
    R invoke(char p1, float p2);
}