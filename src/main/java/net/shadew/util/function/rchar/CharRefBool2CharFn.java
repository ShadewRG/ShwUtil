package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and a {@code boolean} and returns a {@code char}.
 */
public interface CharRefBool2CharFn<P2> {
    char invoke(char p1, P2 p2, boolean p3);
}