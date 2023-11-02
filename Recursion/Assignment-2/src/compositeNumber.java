public class compositeNumber {
    public static void main(String[] args) {
        int n = 7;
        composite(n);
        System.out.println(composite(n,2));
    }
    static void  composite(int n){

        int factors =0;
        for (int i = 1; i <=n ; i++) {
            if(n%i ==0){
                factors++;
            }
        }
        if (factors >2){
            System.out.println("composite number");
        }
        else {
            System.out.println("Not a composite number");
        }
    }

    // Recursive approach

    static int factors=0;
    static boolean composite(int n, int i){
        if(n<=1){
            return false;
        }
        if (i>n/2){
            return false;
        }
        if (n%i==0){
            return true;
        }
        return composite(n,i+1);

    }

}
