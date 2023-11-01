public class sumofOddNumbers {

    static int sum =0;

    public static void main(String[] args) {
        int n =12345;
        System.out.println(sumof(n));
        System.out.println(oddsum(n));
    }
    static int sumof(int n){
        int sum =0;

        while (n!=0){
            int rem = n%10;

            if(rem %2==1){
                sum = sum+rem;
            }
            n =n/10;
        }
        return sum;
    }
    static int oddsum(int n){
        if(n==0){
            return oddsum(n);
        }
        if(n%2 ==1 ){
            sum = sum+n;
        }
        return sumof(--n);
    }
}
