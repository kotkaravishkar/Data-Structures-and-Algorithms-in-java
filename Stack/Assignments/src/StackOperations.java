import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<Integer>();

        solution sl = new solution();

        sl.insert(st,2);
        sl.insert(st,3);
        sl.insert(st,1);
        sl.insert(st,4);

        sl.remove(st);

        sl.headOf_Stack(st);

        sl.find(st,4);

        System.out.println(st);


    }
}
class solution {
    // Function to insert element to stack
    public static void insert(Stack st, int x) {
        st.push(x);
    }

    // Function to pop element from stack
    public static void remove(Stack st) {
        if (!st.empty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }

    // Function to return top of stack
    public static void headOf_Stack(Stack st) {
        if (!st.empty()) {
            int x = (int) st.peek();
            System.out.println(x + " ");
        }
    }

    // Function to find the element in stack
    public static void find(Stack st, int val) {

        if (st.search(val) != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
