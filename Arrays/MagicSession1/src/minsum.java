public class minsum {
    public static void main(String[] args) {
        int [] arr = {3, -4, 2, -3, -1, 7, -5};
        int n = arr.length;
        System.out.println(sum(arr, n));
    }
    static int sum (int []arr, int n){

        for (int i = 1; i <n; i++) {
            arr[i] =arr[i]+arr[i-1];
        }
        

        int sum =0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <n; i++) {

            for (int j = i; j <n; j++) {

                if(i==0){
                    sum = arr[j];
                }
                else{
                    sum = arr[j] - arr[i-1];
                }
                if(sum < min){
                    min = sum;
                }
            }
        }
        return min;
    }
}
