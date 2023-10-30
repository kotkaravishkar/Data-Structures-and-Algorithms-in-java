// WAP to print the numbers between 1 and 10.
public class program1 {
    public static void main(String[] args) {

        int n = 1;
        recursion(n);
    }

    static int recursion (int n){
        if(n==10){
            System.out.println(10);
            return 1;
        }
        System.out.println(n);
        return recursion(n+1);

    }
}
