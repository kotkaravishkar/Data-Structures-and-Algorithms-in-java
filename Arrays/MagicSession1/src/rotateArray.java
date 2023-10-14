/*
 * Problem 7
	Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the
	product of the maximum product subarray.

	Example 1:
		Input:
			N = 5
			Arr[] = {6, -3, -10, 0, 2}
		Output: 180
		Explanation: Subarray with maximum product
			     is [6, -3, -10] which gives the product as 180.
	Example 2:
		Input:
			N = 6
			Arr[] = {2, 3, 4, 5, -1, 0}
		Output: 120
		Explanation: Subarray with maximum product
			     is [2, 3, 4, 5] which gives the product as 120.
 */

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int k = 5;
        int nums[] = {6, -3, -10, 0, 2};
        rotate(nums,5);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k=k%n;
        swap(nums,0,n-1-k);
        swap(nums,n-k,n-1);
        swap(nums,0,n-1);

    }

    static void swap (int[] nums, int low, int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }
}

