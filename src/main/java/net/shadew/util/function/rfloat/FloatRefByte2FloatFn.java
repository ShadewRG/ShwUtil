package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code float}, an object and a {@code byte} and returns a {@code float}.
 */
public interface FloatRefByte2FloatFn<P2> {
    float invoke(float p1, P2 p2, byte p3);
}