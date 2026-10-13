
package Module1_program;

interface CheckNumber {
    boolean check(int n);
}

public class EvenOdd {

    public static void main(String[] args) {

        CheckNumber even = (n) -> n % 2 == 0;
        System.out.println(even.check(4));

        CheckNumber odd = (n) -> n % 2 != 0;
        System.out.println(odd.check(7));
    }
}
