import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(10);
        q.add(30);
        q.add(20);
        q.add(40);

        reverse(q);
        System.out.println(q);

    }

   static void reverse(Queue<Integer> q){

       Stack<Integer> s = new Stack<Integer>();

       while (!q.isEmpty()){
           s.push(q.peek());
           q.remove();
       }
       while (!s.empty()){
           q.add(s.peek());
           s.pop();
       }
    }
}
