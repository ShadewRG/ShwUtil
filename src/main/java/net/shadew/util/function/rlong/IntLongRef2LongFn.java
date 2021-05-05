package net.shadew.util.function.rlong;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code long}.
 */
public interface IntLongRef2LongFn<P3> {
    long invoke(Int p1, Long p2, P3 p3);
}
