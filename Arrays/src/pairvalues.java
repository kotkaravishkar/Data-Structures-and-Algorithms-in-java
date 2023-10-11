/*
/*
 * Given a character array(lowercase)
 * 	Return the count pair(i, j) suzch that
 * 	i) i < k
 * 	ii) arr[i] = 'a'
 *          arr[j] = 'g'
 *
 *      Arr = ['a', 'b', 'e', 'g', 'a', 'g']
 */


public class pairvalues {
    public static void main(String[] args) {

        int [] arr = {'a', 'b', 'e', 'g', 'a', 'g'};
        int n = arr.length;

        int count = 0;
        int pair= 0;

        for (int i = 0; i <n ; i++) {
            if (arr[i] == 'a') {
                count++;
            } else if (arr[i] == 'g') {
                pair = pair + count;
            }
        }
            System.out.println(pair);

    }
}
