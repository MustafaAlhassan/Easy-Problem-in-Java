/*
Implement a method transfer(S,T) that transfers all elements from stack S onto stack T, so that
the element that starts at the top of S is the first to be inserted onto T, and the element at the bottom of
S ends up at the top of T.
*/
import java.util.Stack;

public class Transfer {

    public static void transfer(Stack<Integer>S, Stack<Integer>T){
        while (!S.isEmpty()){
            T.push(S.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);

        Stack<Integer> T = new Stack<>();

        System.out.println("Before transfer from stack S to T:");
        System.out.println(S); //Output: [1, 2, 3, 4]
        System.out.println(T); //Output: []

        transfer(S, T);

        System.out.println("After transfer from stack S to T: ");
        System.out.println(S); //Output: []
        System.out.println(T); //Output: [1, 2, 3, 4]
    }
}
