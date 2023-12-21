import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String S = "{([])}";

        System.out.println(isValid(S));


    }
    public static boolean isValid(String s) {

        Stack<Character> S = new Stack<Character>();

        for(char ch : s.toCharArray()){

            if(ch =='(' || ch =='{' || ch=='['){
                S.push(ch);
            }
            else{
                if(!S.empty()){
                    char x = S.peek();

                    if(x =='[' && ch == ']' || x== '(' && ch ==')' || x== '{' && ch =='}'){
                        S.pop();;
                    }
                    else{
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        if(S.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}

