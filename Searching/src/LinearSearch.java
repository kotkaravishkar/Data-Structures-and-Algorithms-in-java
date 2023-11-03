public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {4,55,2,4,66,87};
        int target = 66;
        System.out.println(linearSearch(arr,target));

    }
    static int linearSearch(int[] arr, int target){
            int index =0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == target){
                index= i;
            }
        }
        return index;
    }
}
