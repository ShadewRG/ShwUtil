package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code byte}, an object and a {@code double} and returns nothing.
 */
public interface ByteRefDouble2VoidFn<P2> {
    void invoke(Byte p1, P2 p2, Double p3);
}
