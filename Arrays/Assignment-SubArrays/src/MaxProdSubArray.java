public class MaxProdSubArray {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 5, -1, 0};
        int n =arr1.length;
        int max = Integer.MIN_VALUE;
        System.out.println(subarraywithmaxpro(arr1,n));

        for (int i = 0; i <n; i++) {
            int prod = 1;
            for (int j = i; j <n ; j++) {
                prod = prod*arr1[j];

                if(prod >max){
                    max=prod;
                }
            }
            }
        System.out.println(max);

    }

    //Optimised Approach

    static int subarraywithmaxpro(int[]arr,int n){
        int max = Integer.MIN_VALUE;

        int pref =1;
        int suff =n-1;

        for (int i = 0; i <n ; i++) {

            if (pref ==0){
                pref=1;
            }
            if (suff==0){
                suff=1;
            }

            pref = pref*arr[i];
            suff = suff*arr[n-i-1];

            max = Math.max(max, Math.max(pref,suff));
        }
        return max;
    }
}


