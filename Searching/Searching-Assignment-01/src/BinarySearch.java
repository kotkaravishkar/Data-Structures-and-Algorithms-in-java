public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,4,9,19,27,38,45};
        int target = 27;
        int start = 0;
        int end = arr.length-1;
        System.out.println(binarysearch(arr,target));
        System.out.println(binary(arr,target,start,end));

    }
    static int binarysearch(int[] arr, int target){

        int start =0;
        int end = arr.length-1;

        while (start <=end){

         int mid = (start + end) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if(arr[mid] <target){
                start = mid+1;
            }
           if (arr[mid] > target){
               end = mid-1;
           }
        }
        return -1;
    }
    static int binary(int [] arr,int target, int start, int end){
        if(end >= start){
            int mid = (start+end)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid]> target){
                return binary(arr,target,start,mid-1);
            }
            else {
                return binary(arr,target,mid+1,end);
            }
        }
        return -1;
    }
}
