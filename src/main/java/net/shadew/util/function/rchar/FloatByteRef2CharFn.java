package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, a {@code byte} and an object and returns a {@code char}.
 */
public interface FloatByteRef2CharFn<P3> {
    char invoke(float p1, byte p2, P3 p3);
}
