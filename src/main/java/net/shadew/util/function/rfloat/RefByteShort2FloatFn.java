package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code byte} and a {@code short} and returns a {@code float}.
 */
public interface RefByteShort2FloatFn<P1> {
    float invoke(P1 p1, byte p2, short p3);
}
