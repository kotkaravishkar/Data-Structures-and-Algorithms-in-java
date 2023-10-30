// WAP to print string in reverse order.

import java.sql.Statement;

public class program9 {
    public static void main(String[] args) {
        String S = "Avishkar";

        System.out.println(reverse(S));
        System.out.println(Reverse(S));

    }
    static StringBuffer reverse(String S) {
        StringBuffer str = new StringBuffer();

        str.append(S);

        str.reverse();

        return str;
    }
    static String Reverse(String S){

        if(S==null || S.length() <=1){
            return S;
        }
   return Reverse(S.substring(1))+S.charAt(0);
    }

}
