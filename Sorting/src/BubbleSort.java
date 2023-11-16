import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {4,5,1,7,9,3,8};
        bubble(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    static void bubble(int [] arr){

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i <n-1; i++) {
            swapped = false;
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
}
