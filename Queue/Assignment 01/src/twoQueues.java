import java.util.LinkedList;
import java.util.Queue;

public class twoQueues {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack();

        System.out.println(stack.pop());

        System.out.println(stack.top());

        System.out.println(stack.empty());
    }
}
class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data){
        while (!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(data);

        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    public int pop(){
        return q1.poll();
    }

    public int top(){
        return q1.peek();

    }
    public boolean empty(){
        return q1.isEmpty();
    }

    public void printStack(){
        for (int ele : q1){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}