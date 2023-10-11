public class EquilibriumofArray {
    public static void main(String[] args) {

        int flag =1;
        int arr[] = new int[]{-7, 1, 5, 2, -4, 3, 0};

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int leftsum =0;
            int rightsum =0;

            for (int j = 0; j <i ; j++) {
                leftsum = leftsum+arr[j];
            }
            for (int j = i+1; j <n ; j++) {
                rightsum = rightsum + arr[j];
            }

            if (leftsum == rightsum){
                flag = 1;
                System.out.println(i);
                break;
            }
        }
        if(flag ==0){
            System.out.println(-1);

        }
    // Optimized Approach
    }

    static int EQ(int []arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int lefsum =0;
            int rightsum =0;


        }



        return -1;
    }
}
