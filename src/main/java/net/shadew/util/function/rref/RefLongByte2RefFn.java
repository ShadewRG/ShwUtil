package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code long} and a {@code byte} and returns an object.
 */
public interface RefLongByte2RefFn<P1, R> {
    R invoke(P1 p1, long p2, byte p3);
}