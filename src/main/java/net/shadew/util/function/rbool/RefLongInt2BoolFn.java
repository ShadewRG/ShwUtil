package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code long} and an {@code int} and returns a {@code boolean}.
 */
public interface RefLongInt2BoolFn<P1> {
    boolean invoke(P1 p1, long p2, int p3);
}