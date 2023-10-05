public class ArrayReverse {
    public static void main(String[] args) {


        int [] arr = {4,5,3,2,7,8};
        int n = arr.length;

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
