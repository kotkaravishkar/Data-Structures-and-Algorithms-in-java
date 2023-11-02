public class magicnumber {
    public static void main(String[] args) {
        int n = 226;
        int temp = 0;
        int sum =0;

            while (n>0|| sum>9){
                if (n==0){
                    n = sum;
                    sum=0;
                }
                int rem = n%10;
                sum = sum+rem;
                n = n/10;
            }

    if (sum==1){
            System.out.println("magic");
        }
        else {
            System.out.println("not a magic");
        }
        magic(n);
        System.out.println(magic(n));

    }

    static int magic(int n){
            if (n < 10) {
                return n;
            }

            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            return magic(sum);
    }
}
