public class ArrayProduct {
    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5};
        int n = arr.length;

        int [] arr2 = new int[n];
        int product = 1;

        for (int i = 0; i <n ; i++) {

            product = (product*arr[i]);

            arr2[i] = product;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
