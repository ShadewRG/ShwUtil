package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code char} and an object and returns a {@code char}.
 */
public interface DoubleCharRef2CharFn<P3> {
    char invoke(double p1, char p2, P3 p3);
}
