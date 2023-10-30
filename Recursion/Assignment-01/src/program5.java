//WAP to check whether the number is prime or not.

public class program5 {
    public static void main(String[] args) {
        int n = 3;
        int temp=0;
        System.out.println(primeornot(n,2));
    }

    static boolean primeornot(int n, int temp){

            if (n <= 2)
                return (n == 2) ? true : false;
            if (n % temp == 0)
                return false;
            if (temp * temp > n)
                return true;
        return primeornot(n,temp+1);
    }
}
