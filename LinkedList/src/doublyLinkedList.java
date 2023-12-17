public class doublyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addfirst(22);
        ll.addfirst(54);
        ll.addfirst(41);
        ll.addfirst(12);
        ll.printDLL();

        ll.addLast(78);
        ll.addLast(65);

        ll.printDLL();

        int count = ll.countNode();
        System.out.println(count);

        ll.addAtPos(4,50);
        ll.printDLL();

        ll.delfirst();
        ll.printDLL();

        ll.delfirst();
        ll.printDLL();

        ll.delAtPos(3);
        ll.printDLL();
    }
}
class  Node{
    Node prev = null;
    int data;
    Node next = null;

    Node(int data){
        this.data = data;
    }
}
class LinkedList{
    Node head = null;

    // AddatFirts

    void addfirst(int data){

        Node newNode = new Node(data);

        if (head ==null){
            head = newNode;
        }
        else{
            newNode.next =head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // AddLast
    void addLast(int data){

        Node newNode = new Node(data);

        if(head ==null){
            head = newNode;
        }

        else{
            Node temp = head;

            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev =temp;
        }
    }
    // CountNode
    int countNode(){
        int count =0;

        if (head == null ){
            return 0;
        }
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Add at Position
    void addAtPos(int pos,int data) {

        Node newNode = new Node(data);

        if (pos <= 0 || pos >= countNode() + 2) {
            System.out.println("Wrong Input");
            return;
        }
        if (pos == 1) {
            addfirst(data);
        } else if (pos == countNode() + 1) {
            addLast(data);
        } else {

        Node temp = head;
        while (pos - 2 != 0) {
            temp = temp.next;
            pos--;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        newNode.next.prev = newNode;
    }
    }

    // Delete First
    void delfirst(){
        if (head ==null){
            System.out.println("Empty Linkedlist");
        } else if (countNode() ==1) {
            head = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
    }
    // Delete Last
     void delLast(){
        if (head == null){
            System.out.println("Empty Linkedlist");
        } else if (countNode()==1) {
            head = null;
        }
        else {
            Node temp = head;

            while(temp.next !=null){
                temp = temp.next;
            }
            temp.prev.next = null;
            temp.prev = null;
        }

     }

     // Delete At Position
    void delAtPos(int pos){
        if(pos <=0 || pos >= countNode()){
            System.out.println("Empty Linkedlist");
        } else if (pos==1) {
            delfirst();
        } else if (pos==countNode()+1) {
            delLast();
        }
        else {
            Node temp = head;

            while(pos-2!=0){
                temp =temp.next;
                pos--;
            }
            temp.next = temp.next.next;
            temp.next.next.prev = temp;
        }
    }
    // PrintList
    void printDLL(){

        if (head == null){
            System.out.println("Empty LinkedList");
        }
        else {
        Node temp = head;
        while (temp.next != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
           System.out.println(temp.data);
        }
    }
}
