package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns nothing.
 */
public interface ByteShortRef2VoidFn<P3> {
    void invoke(byte p1, short p2, P3 p3);
}