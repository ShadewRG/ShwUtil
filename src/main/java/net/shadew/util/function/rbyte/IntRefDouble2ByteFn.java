package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns a {@code byte}.
 */
public interface IntRefDouble2ByteFn<P2> {
    byte invoke(int p1, P2 p2, double p3);
}