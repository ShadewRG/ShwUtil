package net.shadew.util.function.rchar;

/**
 * A function that takes an object and a {@code char} and returns a {@code char}.
 */
public interface RefChar2CharFn<P1> {
    char invoke(P1 p1, char p2);
}
