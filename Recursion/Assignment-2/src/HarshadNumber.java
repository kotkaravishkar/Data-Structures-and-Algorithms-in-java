import org.w3c.dom.ls.LSOutput;

public class HarshadNumber {
    public static void main(String[] args) {
        int n = 156;
        harshad(n);

        int m = (harshad(n,sum));
        System.out.println(m);
    }
    static void harshad(int n){
        int sum =0;
        while (n>0) {

            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if (n%sum == 0){
            System.out.print("harshad number");
        }
        else {
            System.out.println("not a harshad number");
        }
    }
    // Recursive approach


    static int sum =0;
    static int harshad(int n, int sum){

        if( n==0){
            return sum;
        }
        sum = sum+(n%10);

        return harshad(n/10,sum);
    }
}
