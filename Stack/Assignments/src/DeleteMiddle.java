import java.util.Stack;

public class DeleteMiddle {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();

        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');

        int n = st.size(); // Corrected placement of size calculation

        deleteMid(st, n, 0);

        // Printing stack after deletion of middle.
        while (!st.empty()) {
            char p = st.pop();
            System.out.print(p + " ");
        }
    }

    static void deleteMid(Stack<Character> st, int n, int curr) {
        if (st.empty() || curr == n) {
            return;
        }
        char x = st.pop();

        deleteMid(st, n, curr + 1);

        if (curr != n / 2)
            st.push(x);
    }
}
