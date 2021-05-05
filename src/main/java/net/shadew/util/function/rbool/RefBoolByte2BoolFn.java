package net.shadew.util.function.rbool;

/**
 * A function that takes an object, a {@code boolean} and a {@code byte} and returns a {@code boolean}.
 */
public interface RefBoolByte2BoolFn<P1> {
    boolean invoke(P1 p1, boolean p2, byte p3);
}