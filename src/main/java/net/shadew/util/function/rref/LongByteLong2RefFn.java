package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code long} and returns an object.
 */
public interface LongByteLong2RefFn<R> {
    R invoke(long p1, byte p2, long p3);
}