package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code short} and returns an object.
 */
public interface ShortDoubleShort2RefFn<R> {
    R invoke(short p1, double p2, short p3);
}
