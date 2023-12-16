// find element in rotated sorted array

public class rotatedsorted {
    public static void main(String[] args) {
      int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(rotated(nums,target));
    }
    static  int rotated(int[] nums,int target){

        int n =nums.length;
        int start =0;
        int end =n-1;

        while (start<=end) {

            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {

                if (nums[start] <= target && target <= nums[end]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

