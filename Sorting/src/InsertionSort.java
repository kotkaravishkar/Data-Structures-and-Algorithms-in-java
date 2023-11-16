public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,1,7,9,3,8};
        Insertion(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
    static void Insertion(int [] arr) {

        int n = arr.length;

        for (int i = 1; i <n; i++) {
            int ele = arr[i];
            int j =i-1;

            while (j>=0 && arr[j]>ele){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =ele;
        }
    }
    }
