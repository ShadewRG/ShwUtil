package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code char}.
 */
public interface LongByteRef2CharFn<P3> {
    char invoke(long p1, byte p2, P3 p3);
}