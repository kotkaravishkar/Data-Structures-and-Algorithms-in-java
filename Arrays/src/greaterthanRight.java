/*
* Q7. Leaders in an array

Problem Description
- Given an integer array A containing N distinct integers, you have to find all
the leaders in array A. An element is a leader if it is strictly greater than all

the elements to its right side.

NOTE: The rightmost element is always a leader.
Problem Constraints
1 <= N <= 105
1 <= A[i] <= 108

Example Input
Input 1:
A = [16, 17, 4, 3, 5, 2]
Input 2:
A = [5, 4]

Example Output
Output 1:
[17, 2, 5]
Output 2:
[5, 4]

Example Explanation
Explanation 1:
Element 17 is strictly greater than all the elements on the right side to it.
Element 2 is strictly greater than all the elements on the right side to it.
Element 5 is strictly greater than all the elements on the right side to it.

So we will return these three elements i.e [17, 2, 5], we can also return [2,

5, 17] or [5, 2, 17] or any other ordering.

Explanation 2:
Element 5 is strictly greater than all the elements on the right side to it.
Element 4 is strictly greater than all the elements on the right side to it.
So we will return these two elements i.e [5, 4], we can also do any other

ordering.*/

public class greaterthanRight {
    public static void main(String[] args) {


        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int N = arr.length;

        int leftMax[] = new int[N];
        leftMax[0] = arr[0];
        for(int i = 1; i < N; i++) {

            if(leftMax[i - 1] < arr[i]) {

                leftMax[i] = arr[i];
            } else {

                leftMax[i] = leftMax[i - 1];
            }

        }
        for (int i = 0; i <N; i++) {
            System.out.print(leftMax[i]+ " ");
        }
    }
}