/*

Q 5.
Implement binary search to find the element closest to a given target in a sorted
array.

For example, given the input array arr = [1, 2, 4, 7, 9] and the target element 6, the
function should return 7, as 7 is the closest element to 6 in the array.

*/

public class ClosestElement {
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
                end = mid-1;
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