import java.util.Stack;

public class TwoStacks {
    public static void main(String[] args) {
        queue q = new queue();
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.empty());
    }
}
class queue {

    Stack <Integer> s1 = new Stack<>();
    Stack <Integer> s2 = new Stack<>();

    void push(int data){

        while (!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }
    int pop() {
        return s1.pop();
    }
    int peek(){
        return s1.peek();
    }
    boolean empty(){
        return s1.empty();
    }
}