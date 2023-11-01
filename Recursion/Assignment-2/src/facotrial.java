public class facotrial {
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
        System.out.println(factorial(n));
    }
    static int fact (int n ){
        int fact =1;

        for (int i = 1; i <=n ; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static int factorial (int n){

        if(n <=1){
            return 1;
        }
        return n*factorial(--n);
    }

}
