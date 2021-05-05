package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an object and returns a {@code long}.
 */
public interface BoolByteRef2LongFn<P3> {
    long invoke(boolean p1, byte p2, P3 p3);
}