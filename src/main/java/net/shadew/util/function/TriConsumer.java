/*
 * Copyright (c) 2020 Shadew
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shadew.util.function;

import net.shadew.util.contract.Validate;

/**
 * Represents an operation that accepts three input arguments and returns no result. Unlike most other functional
 * interfaces, {@code TriConsumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, Object, Object)}.
 *
 * @param <T> The first type of the input to the operation
 * @param <U> The second type of the input to the operation
 * @param <V> The third type of the input to the operation
 */
@FunctionalInterface
public interface TriConsumer<T, U, V> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param t The first input argument
     * @param u The second input argument
     * @param v The third input argument
     */
    void accept(T t, U u, V v);

    /**
     * Returns a composed {@code Consumer} that performs, in sequence, this operation followed by the {@code after}
     * operation. If performing either operation throws an exception, it is relayed to the caller of the composed
     * operation.  If performing this operation throws an exception, the {@code after} operation will not be performed.
     *
     * @param after The operation to perform after this operation
     * @return A composed {@code Consumer} that performs in sequence this operation followed by the {@code after}
     *     operation
     *
     * @throws NullPointerException If {@code after} is null
     */
    default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
        Validate.notNull(after, "after");
        return (T t, U u, V v) -> {
            accept(t, u, v);
            after.accept(t, u, v);
        };
    }
}
