package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, an object and a {@code double} and returns a {@code byte}.
 */
public interface ByteRefDouble2ByteFn<P2> {
    byte invoke(byte p1, P2 p2, double p3);
}
