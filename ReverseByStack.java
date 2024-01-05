/*
Implement a method reverse(A) that reverses an array A using an instance of Stack.
*/
import java.util.Stack;
import java.util.Arrays;

public class ReverseByStack {

    public static int[] reverse(int A[]){
        Stack<Integer> st = new Stack<>();

        int n = A.length;
        for (int i = 0; i < n; i++) {
            st.push(A[i]);
        }
        for (int i = 0; i < n; i++) {
            A[i] = st.pop();
        }

        return A;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr))); //Output: [5, 4, 3, 2, 1]
    }
}
