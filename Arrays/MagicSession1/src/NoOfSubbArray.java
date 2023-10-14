/*
 * Problem 10
	You are given an array of size N containing integers. Your task is to find the number of
	subarrays that can be formed from the given array. A subarray is defined as a contiguous
	sequence of elements in the array.

	Input:
		arr = [1, 2, 3]
	Output:
		6
	Explanation:
		In this example, the possible subarrays are [1], [2], [3], [1, 2], [2, 3],
		and [1, 2, 3], so the total count is 6.
 */


public class NoOfSubbArray {
    public static void main(String[] args) {

        int arr [] = {1, 2, 3};
        int n = arr.length;
        System.out.println(noSub(arr, n));

    }
    static int noSub(int[] arr, int n){
        return n*(n+1)/2;
    }}
