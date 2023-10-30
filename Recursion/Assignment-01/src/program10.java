// WAP to check whether the given number is palindrome or not.

public class program10 {
    public static void main(String[] args) {
        int n = 1478741;
        int sum =0;
       System.out.println(pali(n));

       int m = palindrom(n,sum);

        if (n==m){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }

    }
    static boolean pali (int n){
        int sum =0;
        int temp = n;

        while (n!=0){
            int rem = n%10;
            sum = sum*10 + rem;
            n = n/10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }

    static int palindrom(int n,int sum ){

        if(n == 0){
            return sum;
        }
        sum = (sum * 10) + (n % 10);

        return palindrom(n / 10, sum);
    }
}
