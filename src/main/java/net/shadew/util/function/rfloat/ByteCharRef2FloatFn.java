package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, a {@code char} and an object and returns a {@code float}.
 */
public interface ByteCharRef2FloatFn<P3> {
    float invoke(byte p1, char p2, P3 p3);
}
