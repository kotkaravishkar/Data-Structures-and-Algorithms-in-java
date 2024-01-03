import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOperations {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int testcase = sc.nextInt();
                while(testcase-- > 0){
                    Queue<Integer> q = new LinkedList<>();
                    int n = sc.nextInt();

                    Operations obj = new Operations();

                    for(int i = 0;i<n;i++){
                        int k = sc.nextInt();
                        obj.insert(q, k);
                    }

                    int x = sc.nextInt();
                    for(int i = 0;i<x;i++){
                        int k = sc.nextInt();
                        int f = obj.findFrequency(q, k);
                        if(f != 0){
                            System.out.println(f);
                        }
                        else{
                            System.out.println("-1");
                        }
                    }
                }
            }
        }

class Operations{
    static void insert(Queue<Integer> q, int k){

        q.add(k);

    }
    static int findFrequency(Queue<Integer> q, int k){

        Queue<Integer> c_q = new LinkedList<>();
        int ans=0;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            c_q.add(curr);
            if(curr==k)
                ans++;
        }
        while(!c_q.isEmpty())
            q.add(c_q.poll());

        return ans;
    }
 }

