package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns a {@code byte}.
 */
public interface DoubleShortRef2ByteFn<P3> {
    byte invoke(double p1, short p2, P3 p3);
}
