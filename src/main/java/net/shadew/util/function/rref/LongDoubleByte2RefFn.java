package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code byte} and returns an object.
 */
public interface LongDoubleByte2RefFn<R> {
    R invoke(long p1, double p2, byte p3);
}
