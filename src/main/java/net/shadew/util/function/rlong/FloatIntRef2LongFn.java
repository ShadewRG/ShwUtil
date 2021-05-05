package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns a {@code long}.
 */
public interface FloatIntRef2LongFn<P3> {
    long invoke(float p1, int p2, P3 p3);
}