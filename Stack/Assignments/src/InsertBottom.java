import java.util.Stack;

 class InsertBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int x = 50;

        Solution ob = new Solution();
        Stack<Integer> S = ob.insertAtBottom(st, x);

        System.out.println(S);

    }
}
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {
        Stack<Integer> s = new Stack<>();
        while(!St.empty()){
            s.push(St.pop());
        }
        St.push(X);
        while(!s.empty()){
            St.push(s.pop());
        }
        return St;
    }
}
