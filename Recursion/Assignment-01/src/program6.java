public class program6 {
    public static void main(String[] args) {
        int n =123;
        System.out.println(sum(n));;
        System.out.println(RecursionSum(123));


    }
    static int sum(int n){
        int sum =0;
        while(n!=0){
            int rem = n%10;
            sum = sum + rem;
            n=n/10;
        }
        return sum;
    }
    static int RecursionSum(int n){

        while(n/10==0){
            return n;
        }
        return RecursionSum(n/10)+(n%10);
    }
}
