package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float} and an object and returns a {@code char}.
 */
public interface FloatRef2CharFn<P2> {
    char invoke(float p1, P2 p2);
}
