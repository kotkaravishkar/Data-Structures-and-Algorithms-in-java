public class MergeSort {
    public static void main(String[] args) {

        int [] arr = {3,4,2,5,1,9,6,8,7};
        int start =0;
        int end = arr.length-1;

        mergeSort(arr,start,end);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }


    static void merge(int[] arr, int start, int mid, int end){

        int n1 = mid-start+1;
        int n2 = end-mid;

        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i]= arr[start+i];
        }
        for (int j = 0; j <n2 ; j++) {
            arr2[j] = arr[mid+1+j];
        }
        int i=0, j=0, k=start;

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
            while(i<arr1.length){
                arr[k] = arr1[i];
                i++;
                k++;
            }
            while(j<arr2.length){
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

    static void mergeSort(int[] arr, int start, int end){
            if(start<end){
                int mid = (start+end)/2;

                mergeSort(arr,start,mid);
                mergeSort(arr,mid+1,end);
                merge(arr,start,mid,end);
            }
    }
}
