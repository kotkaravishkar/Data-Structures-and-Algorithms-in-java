public class ArrayRotation {
    public static void main(String[] args) {
        int [] arr = {4,1,5,3,6};
        int k =2;
        int n = arr.length;
        int []rotated = new int[n];

        for (int i = 0; i <n ; i++) {
            rotated[(i+k)%n] = arr[i];
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(rotated[i] + " ");
        }


    }
}
