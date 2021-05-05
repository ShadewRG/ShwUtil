package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface ByteBoolLong2RefFn<R> {
    R invoke(byte p1, boolean p2, long p3);
}
