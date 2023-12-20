import java.util.*;

public class ArrayStack {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Size");

        int size = sc.nextInt();

        Stack s = new Stack(size);

        char ch;

        do {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Empty");
            System.out.println("5.Size");
            System.out.println("6.PrintStack");
            System.out.println("Enter Your Choice");

            int choice = sc.nextInt();
            switch (choice) {

                case 1: {
                    System.out.println("Enter Element for stack");
                    int data = sc.nextInt();
                    s.push(data);
                }
                break;

                case 2: {
                    int flag = s.pop();
                    if (flag != -1) {
                        System.out.println(flag + " Popped");
                    }
                }
                break;

                case 3: {
                    int flag = s.peek();

                    if (flag != -1) {
                        System.out.println(flag);
                    }
                }
                break;

                case 4: {
                    boolean val = s.empty();

                    if (val) {
                        System.out.println("Empty");
                    } else {
                        System.out.println("Not Empty");
                    }
                }
                break;

                case 5: {
                    int Size = s.size();
                    System.out.println("Stack Size :" + (Size + 1));
                }
                break;

                case 6: {
                    s.PrintStack();
                }
                break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }

            System.out.println("Do you want to Continue?");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}

class Stack {

    int maxSize;
    int[] stackArr;
    int top = -1;

    Stack(int size) {
        this.maxSize = size;
        this.stackArr = new int[size];
    }

    void push(int data) {

        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            stackArr[top] = data;
        }
    }

    boolean empty() {
        if (top == -1) {
            return true;
        } else
            return false;
    }

    int pop() {
        if (empty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int val = stackArr[top];
            top--;
            return val;
        }
    }

    int peek() {
        if (empty()) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return stackArr[top];
        }
    }
    int size(){
        return top;
    }

    void PrintStack(){

        if (empty()){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.print("[");
            for (int i = 0; i <=top; i++) {
                System.out.print(stackArr[i]+" ");
            }
            System.out.println("]");
        }
    }
}