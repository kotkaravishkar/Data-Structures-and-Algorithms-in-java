/*

Q 3. First Occurrence of an Element
Modify the binary search function to find the first occurrence of a given element in
a sorted array. Return -1 if the element is not present.
For example, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element
4, the function should return 1, as 4 first appears at index 1 in the array.

*/
       public class firstoccurance {
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
