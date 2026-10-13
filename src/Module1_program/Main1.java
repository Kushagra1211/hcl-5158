package Module1_program;

class Generics<T> {
    T data;

    Generics(T data) {
        this.data = data;
    }

    T getData(T a) {
        T a1 = a;
        return a1;
    }
}

public class Main1 {
    public static void main(String[] args) {

        Generics<Integer> obj1 = new Generics<>(100);
        Generics<String> obj2 = new Generics<>("Java");

        System.out.println(obj1.<Integer>getData(4));
        System.out.println(obj2.getData("Java"));

    }
}