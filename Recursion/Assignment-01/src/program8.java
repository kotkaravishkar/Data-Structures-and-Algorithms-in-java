//WAP to count the occurrence of a specific digit in a given number.

public class program8 {
   static int count = 0;

    public static void main(String[] args) {
        int n = 54344444;
        int o = 4;
        countoccurrancre(n, o);
       int m = occurancerec(n, o);
        System.out.println(m);
    }

    static void countoccurrancre(int n, int o) {

        int count = 0;
        while (n != 0) {

            if (n % 10 == o) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);

    }

    static int occurancerec(int n, int o) {
        if (n / 10 == 0) {

            return n;
        }
        if (n % 10 == o) {

            count++;
        }
        occurancerec(n / 10, o);
        return count;
    }
}