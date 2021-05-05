package net.shadew.util.function.rref;

/**
 * A function that takes an object, an {@code int} and a {@code char} and returns an object.
 */
public interface RefIntChar2RefFn<P1, R> {
    R invoke(P1 p1, int p2, char p3);
}
