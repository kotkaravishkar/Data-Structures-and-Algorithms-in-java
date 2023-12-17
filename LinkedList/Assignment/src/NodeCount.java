public class NodeCount {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

        int count = ll.countnode();
        System.out.println(count);

    }
}
class Node{
    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}
class LinkedList{

    Node head = null;

    // Add data

    void add(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    int countnode(){
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
     return count;
    }
}
