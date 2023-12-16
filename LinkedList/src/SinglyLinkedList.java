public class SinglyLinkedList{
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);

        ll.printSll();

        ll.addpos(3,25);
        ll.addLast(15);
        ll.printSll();

        ll.delAtPos(3);
        ll.printSll();
        ll.delFirst();
        ll.printSll();
        ll.delLast();
        ll.printSll();

    }
}
class Node{
    int data ;
    Node next = null;

    Node (int data){
        this.data = data;
    }
}
class LinkedList{

    Node head = null;
    // AddFirst
    void addFirst(int data){

        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

        // AddLast
        void addLast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;

        }
        else {
            Node temp = head;

            while (temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        }

        // CountNode

       int countNode() {

        Node temp = head;
           int count =0;

        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;

    }
        // AddPosition

        void addpos(int pos,int data){

        Node newNode = new Node(data);

        Node temp = head;

        while(pos-2!=0){
            temp = temp.next;
            pos--;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        }
    //DeleteatFirst

    void delFirst(){

        if (head == null){
            System.out.println("Empty LinkedList");
        }
        if (countNode()==1){
            head =null;
        }
        else {
            head = head.next;
        }

    }
    void delLast(){
        if (head ==null){
            System.out.println("Empty Linkedlist");
        }
        if (countNode()==1){
            head = null;
        }
        else {
            Node temp = head;

            while (temp.next.next !=null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // Print Linkedlist
        void printSll(){

        if (head ==null){
            System.out.println("Empty Linkedlist");
        }
        else {
            Node temp = head;

            while (temp!=null){
                System.out.print(temp.data+"-");
                temp =temp.next;
            }
            System.out.println();
        }
    }

     void delAtPos(int pos) {
             if (pos <=0 || pos>= countNode()+1){
                 System.out.println("Wrong Input");
             }
             if(pos==1){
                 delFirst();
             } else if (pos ==countNode()) {
                 delLast();
             }
             else {
                 Node temp = head;
                 while (pos-2!=0){
                     temp=temp.next;
                     pos--;
                 }
                 temp.next = temp.next.next;
             }
         }
    }