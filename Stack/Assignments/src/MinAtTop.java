import  java.util.Stack;
public class MinAtTop {
    public static void main(String[] args) {

        int [] arr = {2,4,2,4,1,0,7};
        int n =arr.length;
        GetMin obj = new GetMin();

        obj.push(arr,n);

        Stack<Integer> st = GetMin.push(arr,n);

        GetMin.getMinAtPop(st);

    }
}

class GetMin
{
    //Function to push all the elements into the stack.
    public static Stack<Integer> push(int arr[],int n)
    {
        Stack<Integer> s = new Stack<>();

        s.push(arr[0]);

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int primin = s.peek();
            int min = Math.min(curr,primin);
            s.push(min);
        }
        return s;

    }

    //Function to print minimum value in stack each time while popping.
    static void getMinAtPop(Stack<Integer>s)
    {
        while(!s.empty()){

            System.out.print(s.pop()+" ");
        }
    }
}