package functional_programming;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Integer increment = incrementByOne.apply(10);
        System.out.println(increment);

        Function<Integer, Integer> incrementAndMultiply = incrementByOne.andThen(multiplyByTen);
        System.out.println(incrementAndMultiply.apply(4));
    }

    static Function<Integer, Integer> incrementByOne = n -> n + 1;

    static Function<Integer, Integer> multiplyByTen = n -> n * 10;
}
