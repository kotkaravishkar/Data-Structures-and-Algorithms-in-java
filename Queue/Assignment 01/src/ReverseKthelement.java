import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKthelement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        int  n = 2;

        Queue <Integer> q2 =  reverse(q,n);

        System.out.println(q2);

    }

     public static Queue reverse(Queue<Integer> q,int n) {

        Queue<Integer> q1 = new LinkedList<>();
         Stack <Integer> s = new Stack<>();

         while (n!=0) {
         s.push(q.poll());
         n--;
         }
         while (!s.empty()){
             q1.add(s.pop());
         }

         while (!q.isEmpty()){
             q1.add(q.poll());
         }
         return q1;
    }
}
