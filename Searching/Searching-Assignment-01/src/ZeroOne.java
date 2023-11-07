/*
Given a sorted binary array consisting of only 0s and 1s, write a program to count
the number of 1s in the array using binary search.
For example, given the input array arr = [0, 0, 1, 1, 1, 1, 1], the function should
return 5 as there are five occurrences of the digit 1 in the array.
 */

public class ZeroOne {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
        int N = arr.length;

        if (N > 0) {
            int result = countOnes(arr, 0, N - 1);
            System.out.println("Number of 1s in the array: " + result);
        } else {
            System.out.println("Array is empty!!!");
        }
    }
    static int countOnes(int arr[], int start, int end) {
        if (start <= end) {
            int mid = (start+end) / 2;
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return (end - mid + 1) + countOnes(arr, start, mid - 1);
            }
            if (arr[mid] == 0) {
                return countOnes(arr, mid + 1, end);

            }
            return countOnes(arr, start, mid - 1);
        }
        return 0;
    }
}
