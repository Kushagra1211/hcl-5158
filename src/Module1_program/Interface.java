package Module1_program;

interface Ab {

    void m1();
    void m2();
}

abstract class Ba implements Ab {
    public void m1() {
        System.out.println("Hello");
    }
}
