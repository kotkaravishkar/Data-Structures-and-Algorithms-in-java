public class magicNumber {
    public static void main(String[] args) {

        int n =10;
        int temp = n;
        int sum =0;
        while(temp>0 && sum >9 ){
            if(temp == 0){
               temp= sum;
               sum =0;

            }
            int rem = temp%10;
            sum = sum+rem;
            temp= temp/10;
        }
        System.out.println(sum);
    }
}
