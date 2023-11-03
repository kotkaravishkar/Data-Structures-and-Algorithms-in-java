/*
* 4. Last Occurrence of an Element
modify the binary search function to find the last occurrence of a given element in
a sorted array.
For instance, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element 4,
the function should return 3, as 4 last appears at index 3 in the array.

*/
public class lastoccurance {
    public static void main(String[] args) {
        int arr[] =  {2,4,4,4,6,7,8};
        int target = 4;
        System.out.println(binary(arr,target));

    }
    static int binary(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int firstoccurance = -1;

        while(start <=end){

            int mid = (start+end)/2;

            if(arr[mid] == target){
                firstoccurance =mid;
                start = mid+1;
            }
            if (arr[mid] <target){
                start =mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return firstoccurance;
    }
}