//Given a sorted array of size N and an integer K, find the position(0-based
//indexing) at which K is present in the array using binary search.
//Example 1:
//Input:
//N = 5
//arr[] = {1 2 3 4 5}
//K = 4
//Output: 3
//Explanation: 4 appears at index 3.

public class program1 {
    public static void main(String[] args) {
       int arr[] = {1 ,2 ,3 ,4,5};
       int k  = 4;

        System.out.println(binary(arr,k));


    }
    static int binary(int[]arr, int k){

        int start =0;
        int end = arr.length-1;

        while (start<=end){

           int mid = start + (end - start)/2; //  # Calculate the middle index

            if (arr[mid]==k){
                return mid;
            }
            if (arr[mid]<k){
                start = mid+1;
            }
            if (arr[mid] >k){
                end = mid-1;
            }
        }
    return -1;

    }
}
