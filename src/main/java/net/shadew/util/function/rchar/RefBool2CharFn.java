package net.shadew.util.function.rchar;

/**
 * A function that takes an object and a {@code boolean} and returns a {@code char}.
 */
public interface RefBool2CharFn<P1> {
    char invoke(P1 p1, boolean p2);
}
