package net.shadew.util.function.rint;

/**
 * A function that takes a {@code short}, an object and a {@code byte} and returns an {@code int}.
 */
public interface ShortRefByte2IntFn<P2> {
    int invoke(short p1, P2 p2, byte p3);
}
