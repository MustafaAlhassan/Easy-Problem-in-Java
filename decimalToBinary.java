package Assignment;

import java.util.Stack;

public class decimalToBinary {

    public static String convert(int v){
        Stack<Integer> st = new Stack<>();

        while (v!=0) {
            st.push(v%2);
            v = v/2;
        }
        String binary = "";
        int n = st.size();
        for (int i = 0; i < n; i++) {
            binary = binary + st.pop(); //convert int to String
        }
        return binary;
    }
    public static void main(String[] args) {
        int decimal = 25;
        System.out.println(convert(decimal)); //Output: 11001
    }
}
