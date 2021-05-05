package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code double} and returns an object.
 */
public interface BoolShortDouble2RefFn<R> {
    R invoke(boolean p1, short p2, double p3);
}