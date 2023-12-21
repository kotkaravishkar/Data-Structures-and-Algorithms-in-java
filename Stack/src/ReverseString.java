import java.util.*;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        String S = "India";
        Client obj = new Client();
        String s = obj.Reverse(S);

        System.out.print(s);
    }
}
class Client{
    String Reverse(String S){
        char [] stackArr = new char[S.length()];

        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i <S.length() ; i++) {
            s.push(S.charAt(i));
        }
        int i =0;

        while (!s.empty()){
            stackArr[i] = s.pop();
            i++;
        }
        return new String(stackArr);
    }
}