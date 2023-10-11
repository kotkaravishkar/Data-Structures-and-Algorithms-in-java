/*
* /*
 * 20]  Given an integer array of size N.
 * 	return the length of the smallest subArray when contains both the maximum of
 * 	array of the minimum of array.
 *
 * 	Arr: [1,2,3,1,2,3,4,6,4,6,3]
 */

public class SmallestSubArray {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 5, 5, 3, 2};

        int n =arr.length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int len = Integer.MAX_VALUE;
        int minlength =Integer.MAX_VALUE;

        for (int i = 0; i <n; i++) {
            if (arr[i] == min){
                for (int j = i+1; j <n ; j++) {
                    if (arr[j]==max){
                        len = j-i+1;
                    }
                    if (len <minlength){
                        minlength = len;
                    }
                }
            }
            if (arr[i] == max){
                for (int j = i+1; j <n ; j++) {
                    if (arr[j] == min) {
                    len = j-i+1;
                    }
                    if (minlength> len){
                        minlength = len;
                    }
                }
            }
        }
        System.out.println(minlength);
    }
}
