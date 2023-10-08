/*
Q1. Max Min of an Array

Problem Description
- Given an array A of size N.
- You need to find the sum of the Maximum and Minimum

elements in the given array.

Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109

Example Input
Input 1:
A = [-2, 1, -4, 5, 3]
Input 2:
A = [1, 3, 4, 1]

Example Output
Output 1:
1
Output 2:
5
Example Explanation
Explanation 1:
Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
Explanation 2:
Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.

 */
public class MinMaxSum {
    public static void main(String[] args) {

        int [] arr = {-2, 1, -4, 5, 3};
        int n  = arr.length;

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i = 0; i <n ; i++) {
            if(arr[i] > Max){
                Max = arr[i];
            }
        else if(arr[i]<Min){
            Min = arr[i];
            }
        }
        System.out.println(Max);
        System.out.println(Min);

        System.out.println(Max+Min);


    }
}
