import java.util.Scanner;

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Queue");
        int size = sc.nextInt();

        CQueue q = new CQueue(size);

        char ch;
        do {
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Empty");
            System.out.println("4.Front");
            System.out.println("5.Rare");
            System.out.println("6.PrintQueue");

            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter data for to Enqueue");
                    int data = sc.nextInt();
                    q.enqueue(data);
                }
                break;
                case 2: {
                    int ret = q.dequeue();
                    if (ret != -1) {
                        System.out.println(ret+" Popped");
                    }
                }
                break;

                case 3: {
                    boolean ret = q.enpty();

                    if (ret) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println("Queue is Not empty");
                    }
                }
                break;

                case 4: {
                    int ret = q.front();
                    if (ret!=-1){
                        System.out.println("Front : " + ret);
                    }
                }
                break;

                case 5: {
                    int ret = q.rear();
                    if (ret!=-1){
                        System.out.println("Rare : " + ret);
                    }
                }
                break;

                case 6: {
                    q.printQueue();
                    break;

                }
                default: {
                    System.out.println("Wrong Choice");
                }
            }
            System.out.println("Continue");
            ch = sc.next().charAt(0);
        }
        while (ch=='y' || ch =='Y'
        );

    }
}
class CQueue{
    int MaxSize;
    int front;
    int rear;
    int []DeqeueArr;

    CQueue(int size){
        this.MaxSize = size;
        this.DeqeueArr = new int[size];
        this.front=-1;
        this.rear= -1;

    }

    public void enqueue(int data) {
        if ((front==0 && rear==MaxSize-1) || ((rear+1)%MaxSize==front)){
            System.out.println("Queue is full");
            return;
        } else if (front==-1) {
            front= rear=0;
        } else if (rear ==MaxSize-1 && front!=0) {
            rear=0;
        }
        else {
            rear++;
        }
        DeqeueArr[rear]=data;
    }

    public int dequeue() {

        if (front==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int ret = DeqeueArr[front];

            if (front==rear){
                rear = front = -1;
            } else if (front==MaxSize-1) {
                front = 0;
            }
            else
            front++;
            return ret;
        }
    }

    public void printQueue() {
        if (front <= rear) {
            for (int i =front; i <=rear; i++) {
                System.out.print(DeqeueArr[i]+" ");
            }
        }
        else {
            for (int i =front; i <=MaxSize ; i++) {
                System.out.print(DeqeueArr[i]+" ");
            }
            for (int i = 0; i <=rear ; i++) {
                System.out.print(DeqeueArr[i] + " ");
            }
        }
        System.out.println();
    }

    public int front() {
        if (front==-1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return DeqeueArr[front];

    }

    public boolean enpty() {
        if (front ==-1){
            return true;
        }
        return false;
    }

    public int rear() {
        if (rear ==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
        return DeqeueArr[rear];
    }
}
