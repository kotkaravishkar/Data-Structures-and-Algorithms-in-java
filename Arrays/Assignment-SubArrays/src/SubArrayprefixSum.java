public class SubArrayprefixSum {
    public static void main(String[] args) {


        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        int k=4;

        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        int start = 0;
        int end = k-1;
        int max = Integer.MIN_VALUE;
        int count=0;

        while (end<arr.length) {
            int sum = 0;
            if (start == 0) {
                sum = prefix[end];
            } else {
                sum = prefix[end]-prefix[start-1];
            }
            if(sum==k){
                count++;

            }
            if(sum>max){
                max= sum;
            }
            start++;
            end++;
        }
        System.out.println(max);
        System.out.println(count);


    }
}