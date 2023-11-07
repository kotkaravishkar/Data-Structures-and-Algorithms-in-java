/*

Modify the binary search to find a peak element in a given array.
For example, in the array [1, 3, 20, 4, 1, 0], 20 is a peak element because it is
greater than its neighbors 3 and 4.

* */

public class PeakElement {
    public static void main(String[] args) {
            int arr[] = { 1, 3, 20, 4, 1, 0 };
            int N = arr.length;

            if (N > 0) {
                int result = peakElement(arr, 0, N - 1);
                if (result != -1) {
                    System.out.println("Peak element is: " + result);
                } else {
                    System.out.println("No peak element found");
                }
            } else {
                System.out.println("Array is empty");
            }
        }
    static int peakElement(int arr[], int start, int end) {
        if (start <= end) {
            int mid = (start+end) / 2;

            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 ||
                    arr[mid] >= arr[mid + 1])) {
                return arr[mid];
            }
            if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                return peakElement(arr, mid + 1, end);
            }
            return peakElement(arr, start, mid - 1);
        }
        return -1;
    }
}
