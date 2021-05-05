package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns a {@code boolean}.
 */
public interface DoubleBoolRef2BoolFn<P3> {
    boolean invoke(double p1, boolean p2, P3 p3);
}