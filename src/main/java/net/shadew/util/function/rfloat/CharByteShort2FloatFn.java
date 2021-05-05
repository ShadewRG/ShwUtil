package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code short} and returns a {@code float}.
 */
public interface CharByteShort2FloatFn {
    float invoke(char p1, byte p2, short p3);
}