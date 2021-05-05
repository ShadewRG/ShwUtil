package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code short} and an object and returns a {@code byte}.
 */
public interface LongShortRef2ByteFn<P3> {
    byte invoke(long p1, short p2, P3 p3);
}
