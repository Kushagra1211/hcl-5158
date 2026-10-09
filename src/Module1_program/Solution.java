package Module1_program;

abstract class A {
    abstract void m1();
}

class B extends A {
    @Override
    public void m1() {
        System.out.println("Hello");
    }
}

public class Solution {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}