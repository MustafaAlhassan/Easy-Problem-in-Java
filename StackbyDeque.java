/*
Create a class for the Stack data structure and implement the Stack’s operations push, pop and
peek using an instance of Deque.
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class StackbyDeque {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.print(); //Output: [10, 20, 30, 40, 50]
        System.out.println("Top = " + s.peek());
        s.pop();
        s.pop();
        s.print(); //Output: [10, 20, 30]
    }
}

class Stack {

    Deque<Integer> d;

    public Stack(){
        d = new ArrayDeque<>();
    }
    public void push(int n){
        d.offerLast(n);
    }
    public int pop(){
        return d.pollLast();
    }
    public int peek(){
        return d.peekLast();
    }
    public void print(){
        System.out.println(d);
    } 
}
