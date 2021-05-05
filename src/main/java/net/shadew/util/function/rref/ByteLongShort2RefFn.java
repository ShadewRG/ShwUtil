package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code short} and returns an object.
 */
public interface ByteLongShort2RefFn<R> {
    R invoke(byte p1, long p2, short p3);
}