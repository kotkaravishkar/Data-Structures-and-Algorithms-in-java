public class palindrome {
    static int sum=0;

    public static void main(String[] args) {
        int n =121;
        int sum=0;

        int m = palindrom(n,sum);
        System.out.println(m);
        if (m==n){
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }
    }
    static int palindrom(int n,int sum ) {

        if (n == 0) {
            return sum;
        }
        sum = (sum * 10) + (n % 10);

        return palindrom(n / 10, sum);
    }
}
