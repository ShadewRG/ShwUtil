package net.shadew.util.function.rlong;

/**
 * A function that takes an object, a {@code boolean} and a {@code float} and returns a {@code long}.
 */
public interface RefBoolFloat2LongFn<P1> {
    long invoke(P1 p1, boolean p2, float p3);
}
