/*

Given a sorted array of integers, find the starting and ending position of a given
target value.
Write a program to find the range of the target element in the array.
For example, given the array [5, 7, 7, 8, 8, 10] and the target element 8, the
function should return [3, 4], as 8 appears at positions 3 and 4 in the array.

* */

public class StartEnd {
    public static void main(String[] args){
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int size = arr.length;
        int x = 2;
        int ret1 = firstIndex(arr, 0, size - 1, x, size);
        int ret2 = lastIndex(arr, 0, size - 1, x, size);
        System.out.println("First and last index of "+x+" is "+ret1+" and "+ret2);
    }
    public static int firstIndex(int arr[], int start, int end, int x, int size){
        if (end >= start) {
            int mid = (start + end) / 2;
            if ((mid == 0 || x > arr[mid - 1])
                    && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return firstIndex(arr, (mid + 1), end, x, size);

        else
        return firstIndex(arr, start, (mid - 1), x, size);
        }
        return -1;
        }
public static int lastIndex(int arr[], int start, int end, int x, int size) {
    if (end >= start) {
        int mid = (start + end) / 2;
        if ((mid == size - 1 || x < arr[mid + 1])
                && arr[mid] == x)
            return mid;
        else if (x < arr[mid])
            return lastIndex(arr, start, (mid - 1), x, size);
        else
            return lastIndex(arr, (mid + 1), end, x, size);
    }
    return -1;
}
}