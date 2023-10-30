// WAP to display the first 10 natural numbers in reverse order.

public class program2 {
    public static void main(String[] args) {
        int n =1;
        natural(n);
    }

    static void natural(int n){
        if(n<=10){
            natural(n+1);
            System.out.println(n);
        }
    }
}
