package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte} and an object and returns an {@code int}.
 */
public interface ByteRef2IntFn<P2> {
    int invoke(byte p1, P2 p2);
}
