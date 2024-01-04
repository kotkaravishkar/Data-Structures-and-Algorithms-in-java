import java.util.*;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello";

        String reversed = Reverse(str);

        System.out.println(reversed);
    }

    public static String Reverse(String str) {

        Stack<Character> s = new Stack();

        for (int i = 0; i <str.length() ; i++) {
            s.push(str.charAt(i));
        }

        StringBuilder str1 = new StringBuilder();

        while (!s.empty()){
            str1.append(s.pop());
        }
        return str1.toString();
    }
}
