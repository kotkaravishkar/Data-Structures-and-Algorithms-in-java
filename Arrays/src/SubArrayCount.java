// Print the Count of array Size is K


public class SubArrayCount {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int k = 3;
        int count = 0;
        System.out.println(countsubarry1(arr));
        System.out.println(countsubarry(arr));
    }

    public static int countsubarry1(int [] arr) {

            int k = 3;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {

                int temp = j - 1 + 1;

                if (temp == k) {
                    count++;
                }
            }
        }
        return count;
    }

    // Approach 2

    public static int countsubarry(int [] arr){

        int k=3;
        int count = 0;
        int start = 0;
        int end = k-1;

        while (end<arr.length){
            count++;
            end++;
        }
        return count;
    }
}
