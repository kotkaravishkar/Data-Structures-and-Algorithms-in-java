import java.util.Scanner;

public class TwoStacks {
    public static void main(String[] args) {

        int size = 4;
        Stacks obj = new Stacks(size);

        obj.push1(10);
        obj.push1(10);
        obj.push2(10);
        obj.push2(10);

        obj.pop1();
        obj.pop2();
    }
}

class Stacks {

    int top1 = -1;
    int top2;
    int[] stackArr;
    int maxSize;

    Stacks(int size) {
        this.maxSize = size;
        this.stackArr = new int[size];
        this.top2 = size;
    }

    void push1(int data) {
        if (top2 - top1 > 0) {
            top1++;
            stackArr[top1] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int data) {
        if (top2 - top1 > 0) {
            top2--;
            stackArr[top2] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int val = stackArr[top1];
            top1--;
            return val;
        }
    }

    int pop2() {
        if (top2 == maxSize) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int val = stackArr[top2];
            top2++;
            return val;
        }
    }

}
