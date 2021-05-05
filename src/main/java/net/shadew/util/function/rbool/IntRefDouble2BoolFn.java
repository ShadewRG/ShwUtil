package net.shadew.util.function.rbool;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns a {@code boolean}.
 */
public interface IntRefDouble2BoolFn<P2> {
    boolean invoke(int p1, P2 p2, double p3);
}