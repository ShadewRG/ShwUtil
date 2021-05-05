package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, a {@code float} and an object and returns a {@code char}.
 */
public interface BoolFloatRef2CharFn<P3> {
    char invoke(boolean p1, float p2, P3 p3);
}
