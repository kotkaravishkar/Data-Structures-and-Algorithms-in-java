import java.util.HashSet;
import java.util.Set;

/*
 Subarray with 0 sum
Given an array of positive and negative numbers. Find if there is a subarray
(of size at-least one) with 0 sum.
Example 1:
Input:
5
4 2 -3 1 6
Output:
Yes
Explanation:
2, -3, 1 is the subarray
with sum 0.
Example 2:
Input:
5
4 2 0 1 6
Output:
Yes
Explanation:
0 is one of the element
in the array so there exist a
subarray with sum 0.

* */public class SubArraySumzero {
    public static void main(String[] args) {
        int [] arr = {4,2,-3,1,6};
        int n = arr.length;
        System.out.println(subArrayWith0Sum(arr,n));
        System.out.println(subarrywith0(arr,n));

    }
    public static boolean subArrayWith0Sum(int arr[], int n){
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0)
                return true;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0)
                    return true;
            }
        }
   return false;
    }

    public static boolean subarrywith0(int[] arr,int n){
        Set <Integer> hash = new HashSet<Integer>();

        int sum = 0;

        for (int i = 0; i <n ; i++) {
            sum = sum+arr[i];

            if (arr[i] ==0 || sum ==0 || hash.contains(sum)){
                return true;
            }
            hash.add(sum);
        }

        return false;

    }}
