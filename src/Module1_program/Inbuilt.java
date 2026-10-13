
package Module1_program;

import java.util.function.*;

public class Inbuilt {
    public static void main(String[] args) {

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println("Predicate: " + even.test(4));

        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Function: " + square.apply(5));

        Consumer<String> print = s -> System.out.println(s);
        print.accept("Consumer: Hello Java");

        Supplier<Integer> value = () -> (int)( Math.random()*5);
        System.out.println("Supplier: " + value.get());

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("BI Function: " +add.apply(10, 20));
    }
}
