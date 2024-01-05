/*
Suppose you have a deque D containing the numbers (1,2,3,4,5,6,7,8), in this order. Suppose
further that you have an initially empty queue Q. Give a code fragment that uses only D and Q (and no
other variables) and results in D storing the elements in the order (1,2,3,5,4,6,7,8).
*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class Reorder {

    public static void reoreder(Deque<Integer> D){

        Queue<Integer> Q = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            Q.offer(D.poll());
        }
        D.add(D.remove()); //move 4 to the end
        Q.add(D.remove());

        Q.add(D.pollLast()); 

        while (!D.isEmpty()) {
            Q.add(D.remove());
        }
        while (!Q.isEmpty()) {
            D.add(Q.poll());
        }

    }

    public static void main(String[] args) {
        Deque<Integer> D = new ArrayDeque<>();

        D.addAll(List.of(1,2,3,4,5,6,7,8));

        System.out.println("Before reorder:");
        System.out.println(D); //[1, 2, 3, 4, 5, 6, 7, 8]
        reoreder(D);
        System.out.println("After reorder:");
        System.out.println(D); //[1, 2, 3, 5, 4, 6, 7, 8]
    }
}
