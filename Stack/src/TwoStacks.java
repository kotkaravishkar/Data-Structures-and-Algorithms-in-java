import java.util.*;

public class TwoStacks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        Stacks obj = new Stacks(size);
        char ch ;

        do{
            System.out.println("1.Push1");
            System.out.println("2.Push2");
            System.out.println("3.Pop1");
            System.out.println("4.Pop2");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter Element for Stack1");
                    int data = sc.nextInt();
                    obj.push1(data);
                }
                break;

                case 2: {
                    System.out.println("Enter Element for Stack1");
                    int data = sc.nextInt();
                    obj.push2(data);
                }
                break;

                case 3: {
                    int ret = obj.pop1();
                    if (ret != -1) {
                        System.out.println(ret + "Popped from Stack1");
                    }
                }
                break;

                case 4: {
                    int ret = obj.pop2();
                    if (ret != -1) {
                        System.out.println(ret + "Popped from Stack1");
                    }
                    break;
                }
                default: {
                    System.out.println("Wrong Choice");
                    break;
                }
            }
                System.out.println("Continue ??");
                ch = sc.next().charAt(0);

        }while(ch =='y' || ch=='Y');
    }
    }

class Stacks{

    int top1 = -1;
    int top2 ;
    int []stackArr;
    int maxSize;

    Stacks(int size){
        this.maxSize = size;
        this.stackArr = new int[size];
        this.top2 = size;
    }

    void push1(int data){
        if (top2-top1 >0){
            top1++;
            stackArr[top1] =data;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    void push2(int data){
        if (top2-top1 >0){
            top2--;
            stackArr[top2] =data;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }
    int pop1(){
        if (top1==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int val = stackArr[top1];
            top1--;
            return val;
        }
    }
      int pop2(){
        if (top2==maxSize){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int val = stackArr[top2];
            top2++;
            return val;
        }
    }
}
