package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code short} and returns an object.
 */
public interface LongByteShort2RefFn<R> {
    R invoke(long p1, byte p2, short p3);
}