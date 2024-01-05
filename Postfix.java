package Assignment;

import java.util.Stack;

public class Postfix {

    public static int calculatePostfix(String p) {
        Stack<Integer> s = new Stack<>();
        if (p.isEmpty())
            return -1;
        else {
            String arr[] = p.split(" "); // to spilt postfix and put it in array
            for (String c : arr) {
                if (Character.isDigit(c.charAt(0))) // to check c if number or not
                    s.push(Integer.valueOf(c));

                else {
                    int a = s.pop();
                    int b = s.pop();

                    switch (c) {
                        case "+":
                            s.push(b + a);
                            break;
                        case "-":
                            s.push(b - a);
                            break;
                        case "*":
                            s.push(b * a);
                            break;
                        case "/":
                            s.push(b / a);
                            break;
                    }
                }
            }
        }
        return s.pop();
    }

    public static void main(String[] args) {
        String p = "4 2 + 5 3 - *";
        System.out.println(calculatePostfix(p)); // Output: 12
    }
}