package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns an {@code int}.
 */
public interface ByteRefInt2IntFn<P2> {
    int invoke(byte p1, P2 p2, int p3);
}