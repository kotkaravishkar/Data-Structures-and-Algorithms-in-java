import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1, 9, 6, 8, 7};
        int start = 0;
        int end = arr.length - 1;

        quicksort1(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }


    private static void quicksort1(int[] arr, int start, int end) {

        if (start<end){

            int pivotindex = partition(arr,start,end);

            quicksort1(arr,start,pivotindex-1);
            quicksort1(arr,pivotindex+1,end);
        }

    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int i = start-1;

        for (int j = start; j <end ; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;

        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
