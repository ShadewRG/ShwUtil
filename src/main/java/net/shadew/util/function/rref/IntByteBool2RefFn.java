package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface IntByteBool2RefFn<R> {
    R invoke(int p1, byte p2, boolean p3);
}
