import java.util.Stack;

class StackDesigner {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 2, 4};
        int n = arr.length;

        design obj = new design();
        Stack St = obj._push(arr, n);
        obj._pop(St);
    }

    static class design {
        static Stack<Integer> _push(int[] arr, int n) {
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < n; i++) {
                s.push(arr[i]);
            }
            return s;
        }
        static void _pop(Stack<Integer> s) {
            while (!s.empty()) {
                System.out.print(s.pop() + " ");
            }
        }
    }
}
