package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface LongByteByte2RefFn<R> {
    R invoke(long p1, byte p2, byte p3);
}
