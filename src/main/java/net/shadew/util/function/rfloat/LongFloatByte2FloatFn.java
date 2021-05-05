package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code byte} and returns a {@code float}.
 */
public interface LongFloatByte2FloatFn {
    float invoke(long p1, float p2, byte p3);
}