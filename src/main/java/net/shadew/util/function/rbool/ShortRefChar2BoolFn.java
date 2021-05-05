package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns a {@code boolean}.
 */
public interface ShortRefChar2BoolFn<P2> {
    boolean invoke(short p1, P2 p2, char p3);
}