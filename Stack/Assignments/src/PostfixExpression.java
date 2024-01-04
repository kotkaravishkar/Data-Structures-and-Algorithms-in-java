import java.io.*;
import java.util.Stack;

public class PostfixExpression {

    public static void main (String[] args) throws IOException {

        String S = "231*+9-";

      evaluation obj = new evaluation();
        int result = obj.evaluatePostFix(S);

        System.out.println(result);
    }
}
// } Driver Code Ends


class evaluation {
    public static int evaluatePostFix(String s) {
        Stack <Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                st.push(s.charAt(i) - '0');
            } else {
                int op2 = st.peek();
                st.pop();
                int op1 = st.peek();
                st.pop();

                switch (s.charAt(i)) {


                    case '+': {
                        st.push(op1 + op2);
                        break;

                    }
                    case '-': {
                        st.push(op1 - op2);
                        break;

                    }
                    case '*': {
                        st.push(op1 * op2);
                        break;

                    }
                    case '/': {
                        st.push(op1 / op2);
                        break;

                    }
                    case '^': {
                        st.push((int) Math.pow(op1, op2));
                        break;
                    }
                }
            }
        }
        return st.peek();
    }
}