public class LinkedListStack {
    public static void main(String[] args) {

    }
}
class stack{
    Node head;
    int size;

    public stack(int size){
        this.size=size;
        head = null;
    }

    void push(int data){
        Node temp = new Node(data);

        temp.next = head;
        head = temp;
    }
    int peek() {
        if (head == null) {
            System.out.println("Underflow data");
        }
        return head.data;
    }

    void pop(){
        if (head ==null){
            System.out.println("Stack is Empty");
        }
        int val = head.data;
        head = head.next;
        size--;
    }

    boolean Empty(){
        return head ==null;
    }

    int size(){
        return size;
    }

}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}