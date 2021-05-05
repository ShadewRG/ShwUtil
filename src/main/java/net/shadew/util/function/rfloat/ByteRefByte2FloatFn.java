package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code byte}, an object and a {@code byte} and returns a {@code float}.
 */
public interface ByteRefByte2FloatFn<P2> {
    float invoke(byte p1, P2 p2, byte p3);
}
