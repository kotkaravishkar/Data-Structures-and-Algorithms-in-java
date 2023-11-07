/*
Write a program to find the index where a given target element should be inserted
in a sorted array to maintain the array's sorted order.
For example, given the input array sortedArray = [1, 3, 5, 6] and the target element
5, the function should return 2, as 5 is already present at index 2. If the target
element is 2, the function should return 1, as inserting 2 at index 1 would maintain
the sorted order.
**/

public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 5;
        int result = searchInsert(arr, 0, arr.length - 1, target);
        System.out.println("Index to insert " + target + " is: " + result);
    }
    static int searchInsert(int arr[], int start, int end, int target) {
        if (start <= end) {
            int mid = (start+end) / 2;
            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return searchInsert(arr, start, mid - 1, target);

            return searchInsert(arr, mid + 1, end, target);
        }
        return start;
    }
}
