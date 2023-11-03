public class BinrarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,9,14,19,22,38,46,88};
        int target = 22;
        System.out.println(binarysearch(arr,target));

    }
    static int  binarysearch(int[]arr,int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start + end) / 2;

            if (arr[mid]== target){
                return mid;
            }
            if (arr[mid] > target){
                end = mid-1;
            }
            if (arr[mid] <target){
                start = mid+1;
            }
        }
        return -1;
    }
}
