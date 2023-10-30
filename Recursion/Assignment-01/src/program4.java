//WAP to print the length of digits in a number.
//

  public class program4 {
    public static void main(String[] args) {
        int n =123;
        System.out.println(count(n));
        System.out.println(Rcount(n));

    }
    static int count(int n ){

        int count =0;

        while (n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    static int Rcount(int n){

        while(n/10==0){
            return 1;
        }
        return 1+Rcount(n/10);

    }}
