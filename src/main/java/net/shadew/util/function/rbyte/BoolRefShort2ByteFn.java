package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code boolean}, an object and a {@code short} and returns a {@code byte}.
 */
public interface BoolRefShort2ByteFn<P2> {
    byte invoke(boolean p1, P2 p2, short p3);
}