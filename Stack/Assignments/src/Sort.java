import java.util.Stack;
 class Sort {
     public static void main(String[] args) {

         Stack s = new Stack<>();

         s.push(10);
         s.push(40);
         s.push(30);
         s.push(20);

         Sorting obj = new Sorting();

         System.out.println(obj.sort(s));
     }

 }
class Sorting{
    public Stack<Integer> sort(Stack<Integer> s)
    {
        if(!s.empty()){

            int temp = s.pop();

            sort(s);

            sortedInsert(s,temp);
        }
        return s;
    }

    void sortedInsert(Stack<Integer> s, int x){

        if(s.empty() || s.peek()<x){
            s.push(x);
        }
        else{
            int temp =s.pop();
            sortedInsert(s,x);
            s.push(temp);
        }

    }
}