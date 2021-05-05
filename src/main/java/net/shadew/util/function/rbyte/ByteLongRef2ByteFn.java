package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code byte}.
 */
public interface ByteLongRef2ByteFn<P3> {
    byte invoke(byte p1, long p2, P3 p3);
}