public class productofnumber {
    public static void main(String[] args) {
        int n =555;
        int prod=1;

        while (n>0){
            int rem = n%10;
            prod = prod*rem;
            n= n/10;
        }
         System.out.println(prod);
         System.out.println(product(n));
    }
    static int product(int n){

        if (n/10==0){
            return n;
        }

        return product(n/10)*(n%10);

    }
}
