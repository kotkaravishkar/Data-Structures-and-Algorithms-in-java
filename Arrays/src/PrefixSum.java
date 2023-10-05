public class PrefixSum {
    public static void main(String[] args) {

        int [] arr= {2,3,5,6,9,1};
        int n = arr.length;

        int [] pref = new int[n];

        pref[0] = arr[0];

        for (int i =1; i <n ; i++) {
            pref[i] = arr[i]+arr[i-1];
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(pref[i]);
        }
    }
}
