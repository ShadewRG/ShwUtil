package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an object and a {@code double} and returns an object.
 */
public interface CharRefDouble2RefFn<P2, R> {
    R invoke(char p1, P2 p2, double p3);
}