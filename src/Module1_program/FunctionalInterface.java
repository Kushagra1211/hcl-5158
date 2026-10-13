
package Module1_program;

interface Calculator {
    public int calculate(int a, int b);
}

public class FunctionalInterface {

    public static void main(String[] args) {

        Calculator c = (a, b) -> a + b;
        System.out.println(c.calculate(3, 4));

        Calculator c2 = (a, b) -> a - b;
        System.out.println(c2.calculate(3, 4));

        Calculator c3 = (a, b) -> a * b;
        System.out.println(c2.calculate(3, 4));

        Calculator c4 = (a, b) -> a/b;
        System.out.println(c2.calculate(3, 4));
    }
}
