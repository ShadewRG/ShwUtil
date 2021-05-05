package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code boolean}.
 */
public interface ByteLongRef2BoolFn<P3> {
    boolean invoke(byte p1, long p2, P3 p3);
}
