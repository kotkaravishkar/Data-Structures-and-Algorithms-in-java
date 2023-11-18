public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,4,1,9,5,2,8};

        Selection(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }


    }
    static void Selection(int [] arr){
        int n =arr.length;

        for (int i = 0; i <n-1; i++) {
            int min = i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] =temp;
            }
        }
}
