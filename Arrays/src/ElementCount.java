/*Given an integer array of size N.
        *    COunt the no of element having at least 1 element greater than itself.
        *
        *      Arr = [2,5,1,4,8,0,8,1,3,8]
        *      N = 10
        *      Output = 7
        */

public class ElementCount {
    public static void main(String[] args) {

        int [] arr = new int[]{2,5,1,4,8,0,8,1,3,8};

        int count =0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i] <arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(optimize(arr));
    }
    static int optimize (int [] arr){
        int n = arr.length;
        int count =0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i] ==max){
                count++;
            }
        }


return n-count;
    }}
