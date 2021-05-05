package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code short}.
 */
public interface CharRefInt2ShortFn<P2> {
    short invoke(char p1, P2 p2, int p3);
}
