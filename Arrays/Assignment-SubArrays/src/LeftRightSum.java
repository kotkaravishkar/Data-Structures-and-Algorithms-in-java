/*
 Equal Left and Right Subarray Sum

Given an array A of n positive numbers. The task is to find the first index in
the array such that the sum of elements before it is equal to the sum of
elements after it.
Note: Array is 1-based indexed.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: For second test case
at position 3 elements before it
(1+3) = elements after it (2+2).

Example 2:
Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
it is the only point.
Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
Constraints:
1 <= n <= 10^6
1 <= A[i] <= 10^8
*/


public class LeftRightSum {
    public static void main(String[] args) {
        int[] arr={5,-1,4,6,12,0,-4};
        int n=arr.length;
        int res =-1;
        System.out.println(sum(arr));

        for (int i = 0; i <n ; i++) {
            int left = 0;
            int right=0;

            for (int j = 0; j <i ; j++) {
               left =  left +arr[j];
            }
            for (int j = i+1; j <n ; j++) {
                right =right+arr[j];
            }
            if (left==right){
                res=arr[i];
            }
        }
        System.out.println(res);
    }
// optimized approach using prefix sum



    static int sum(int []arr){
        int n=arr.length;
        int res =-1;

        int[] prefixSum=new int[n];
        int[] sufixSum=new int[n];
        prefixSum[0]=arr[0];
        sufixSum[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for(int i=n-2;i>=0;i--){
            sufixSum[i]=sufixSum[i+1]+arr[i];

        }
        for(int i=0;i<n;i++){
            if(prefixSum[i]==sufixSum[i])
            res=arr[i];
        }
        return res;
    }
}

