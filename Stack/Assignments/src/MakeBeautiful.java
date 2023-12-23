import java.util.Stack;

public class MakeBeautiful {
    public static void main(String[] args) {

        int [] arr = {4,2,-2,1};
        System.out.println(makebeautiful(arr));

    }

    public static Stack<Integer> makebeautiful(int []arr){

        Stack <Integer> S = new Stack<>();

        for (int n:arr) {

            if (S.empty()){
                S.push(n);
            }
            else{
                if ((S.peek() >=0 && n<0) || (S.peek()<0 && n>=0)){
                    S.pop();
            }
                else {
                    S.push(n);}            }
        }
        return S;
    }
}
