package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float}, an object and a {@code float} and returns a {@code short}.
 */
public interface FloatRefFloat2ShortFn<P2> {
    short invoke(float p1, P2 p2, float p3);
}
