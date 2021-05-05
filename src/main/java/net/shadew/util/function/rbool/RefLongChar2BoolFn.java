package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code long} and a {@code char} and returns a {@code boolean}.
 */
public interface RefLongChar2BoolFn<P1> {
    boolean invoke(P1 p1, long p2, char p3);
}