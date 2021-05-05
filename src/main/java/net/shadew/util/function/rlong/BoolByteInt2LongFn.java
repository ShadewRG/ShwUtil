package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an {@code int} and returns a {@code long}.
 */
public interface BoolByteInt2LongFn {
    long invoke(boolean p1, byte p2, int p3);
}