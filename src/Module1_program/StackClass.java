package Module1_program;

import java.util.ArrayDeque;

public class StackClass {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        System.out.println("Top: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Is empty? " + stack.isEmpty());

        System.out.println("Size: " + stack.size());

        System.out.println("Contains 10? " + stack.contains(10));

        stack.push(40);
        System.out.println("After" + stack);


        stack.offer(50);
        System.out.println("After " + stack);



        System.out.println("First: " + stack.getFirst());
        System.out.println("Last: " + stack.getLast());

        stack.clear();
        System.out.println("After clear: " + stack);
    }
}