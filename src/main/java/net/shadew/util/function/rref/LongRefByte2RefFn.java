package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns an object.
 */
public interface LongRefByte2RefFn<P2, R> {
    R invoke(long p1, P2 p2, byte p3);
}