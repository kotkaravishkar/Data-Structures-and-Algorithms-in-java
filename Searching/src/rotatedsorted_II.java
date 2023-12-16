// find element in rotated sorted array

public class rotatedsorted_II {
    public static void main(String[] args) {
        int [] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(rotated(nums,target));
    }
    static  boolean rotated(int[] nums,int target){

        int n =nums.length;
        int start =0;
        int end =n-1;

        while (start<=end) {

            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] ==nums[end]){
                start++;
                end--;
                continue;
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
        return false;
    }
}

