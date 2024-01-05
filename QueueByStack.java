package Assignment;

import java.util.Stack;

public class QueueByStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.print(); //Output: [5, 10, 15, 20] 
        System.out.println("First element in queue: " + q.first());
        q.dequeue();
        q.dequeue();
        q.print(); //Output: [15, 20]
        System.out.println("First element in queue: " + q.first());
    }
}

class Queue{
    Stack<Integer> s1;
    Stack<Integer> s2;

    Queue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void enqueue(int n){
        s1.push(n);
    }

    public int dequeue(){
        if(s1.isEmpty()){
            System.out.println("The Queue is Empty.");
            return -1;
        }
        transferS1ToS2();
        int dequ = s2.pop();
        transferS2ToS1();
        return dequ;
    }

    public int first(){
        if(s1.isEmpty()){
            System.out.println("The Queue is Empty.");
            return -1;
        }
        transferS1ToS2();
        int firstElement = s2.peek();
        transferS2ToS1();
        return firstElement;
    }

    public void print(){
        System.out.println(s1);
    }

    private void transferS1ToS2(){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    private void transferS2ToS1(){
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
}
