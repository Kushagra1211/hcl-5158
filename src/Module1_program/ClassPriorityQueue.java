
package Module1_program;

import java.util.Collections;
import java.util.PriorityQueue;

public class ClassPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.offer(20);

        System.out.println("Priority Queue: " + pq);


        System.out.println("Peek: " + pq.peek());

        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);

        System.out.println("Size: " + pq.size());


        System.out.println("Is empty? " + pq.isEmpty());


        System.out.println("Contains 30? " + pq.contains(30));


        pq.remove(30);
        System.out.println("After removing 30: " + pq);


        pq.offer(5);
        System.out.println("After offer 5: " + pq);


        System.out.print("Priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();


        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(40);
        maxHeap.offer(20);
        maxHeap.offer(30);

        System.out.println("Max-Heap: " + maxHeap);
        System.out.println("Largest: " + maxHeap.peek());


        maxHeap.clear();
        System.out.println("After clear: " + maxHeap);
    }
}
