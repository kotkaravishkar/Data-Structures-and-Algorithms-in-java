import java.util.Stack;

public class Merge {
    public static void main(String[] args) {

        Stack<Integer> S1 = new Stack<Integer>();
        Stack<Integer> S2 = new Stack<Integer>();

        S1.push(1);
        S1.push(3);
        S1.push(5);
        S1.push(7);

        S2.push(2);
        S2.push(4);
        S2.push(6);
        S2.push(8);
        S2.push(10);

        MergeStack ms = new MergeStack();

        Stack S3 = ms.mergeStacks(S1,S2);

        System.out.println(S3);
    }
}
class MergeStack{

     Stack<Integer> mergeStacks(Stack<Integer>S1,Stack<Integer>S2){

        Stack<Integer>  s3 = new Stack<>();

        while (!S1.empty() && !S2.empty()){

            if (S1.peek()>S2.peek()){
                s3.push(S1.pop());
            }
            else {
                s3.push(S2.pop());
            }
        }
        while(!S1.empty()){
            s3.push(S1.pop());
        }
         while(!S2.empty()) {
             s3.push(S2.pop());
         }
        while (!s3.empty()){
            S1.push(s3.pop());
        }
         return S1;

    }
}
