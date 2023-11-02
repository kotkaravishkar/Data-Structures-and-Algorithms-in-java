public class AbudantNumber {
    public static void main(String[] args) {
        int n=19;

        abudantnumber(n);
        System.out.println(abudant(n,2,sum));
    }
    static void abudantnumber(int n){
        int sum =0;
        int factors=0;

        for (int i = 1; i <n; i++) {
            if(n%i==0){
                sum = sum+i;
            }
        }
        if (sum>n){
            System.out.println("Abudant Number");
        }
        else {
            System.out.println("Not a Abudant Number");
        }
    }
    // Recursive approach

    static int sum=0;
    static boolean abudant(int n,int i,int sum){

        if(n<=1){
            return false;
        }
      if (i>n/2){
          return sum>n;
      }
      if(n%i==0)
      {
           sum =sum+i;
      }
        return abudant(n,i+1,sum);
    }
}
