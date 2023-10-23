// Kadane's Algorithm

public class kadanes {
    public static void main(String[] args) {
        int [] arr = {1,-5,4,7,8,5,7};
        int n = arr.length;

        int sum =0;
        int max= Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            sum = sum+arr[i];

            if(sum >max){
                max = sum;

            }
        if(sum<0){
            sum=0;
        }
        }
        System.out.println(max);
    }
}
