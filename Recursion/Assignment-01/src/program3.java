// WAP to print the sum of n natural numbers

public class program3 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println(sumofnumbers(n));
    }


    static int sumofnumbers(int n){
        if (n<=1){
            return n;
        }
       return n + sumofnumbers(n-1);
    }
}