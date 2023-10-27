import java.util.HashMap;

public class largestSubarraySum0 {
    public static void main(String[] args) {
        int [] arr = {15,-2,2,-8,1,7,10,23};
        int n =arr.length;
        System.out.println(largestsum(arr));
        System.out.println(Maxlength(arr,n));
    }
    static int largestsum(int[] arr){

        int n = arr.length;
        int max=0;

        for (int i = 0; i <n; i++) {
            int sum =0;
            for (int j = i; j <n; j++) {
                sum = sum+arr[j];

                if(sum ==0){
                    max = Math.max(max,j-i+1);
                }

            }
        }
        return max;
    }
    //Optimized Approach

    static int Maxlength(int [] arr, int n){

        HashMap <Integer,Integer> hash = new HashMap<>();

        int max = 0;
        int sum = 0;

        for (int i = 0; i <n; i++) {
            sum = sum+arr[i];

            if(sum==0){
                max = i+1;
            }
           else if (hash.get(sum) != null) {
                 max = Math.max(max,i-hash.get(sum));
                }
            else {
                hash.put(sum,i);
            }
        }
return max;
    }}
