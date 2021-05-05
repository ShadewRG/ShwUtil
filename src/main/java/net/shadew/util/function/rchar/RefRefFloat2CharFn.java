package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an object and a {@code float} and returns a {@code char}.
 */
public interface RefRefFloat2CharFn<P1, P2> {
    char invoke(P1 p1, P2 p2, float p3);
}
