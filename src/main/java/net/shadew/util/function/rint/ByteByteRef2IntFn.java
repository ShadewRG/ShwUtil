package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns an {@code int}.
 */
public interface ByteByteRef2IntFn<P3> {
    int invoke(byte p1, byte p2, P3 p3);
}