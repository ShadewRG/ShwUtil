package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface LongRefInt2BoolFn<P2> {
    boolean invoke(long p1, P2 p2, int p3);
}