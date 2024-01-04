import java.util.Stack;

public class ImmediateSmaller {
    public static void main(String[] args) {
        int arr[] = {4,7,8,2,3,1};
        Smaller(arr);
    }

    static void Smaller(int [] arr){
        Stack <Integer> s = new Stack<Integer>();
        int n = arr.length-1;

        int [] arr2 = new int[n+1];
        for (int i = n; i >=0; i--) {
                if(!s.isEmpty() && s.peek()<arr[i]){
                    arr2[i]=s.peek();
                    s.pop();
                }else{
                    arr2[i]=-1;
                }
                s.push(arr[i]);
            }
            for(int i = 0; i <= n ; i++){
                System.out.print(arr2[i]+" ");
            }
    }}
