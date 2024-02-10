public class LinkedList {
    //default constructor initializes class variable-head of type-Node with default value-null
    static Node head;
    //now the value of head is null
    public static void main(String[] args) {

        Node node1=new Node();//node1 containing the reference to object created in heap
        node1.data=1;//initialising members of object through dot syntax
        node1.next=head;//value of variable-next of object is null
        head=node1;//now head is containing the reference to this object

        Node node2=new Node();//node2 containing the reference to 2nd object created in heap
        node2.data=2;
        node2.next=head;//now next of node2 is containing the reference to first object
        head=node2;//now head is containing the reference to 2nd object

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next);
    }
}
class Node{
    int data;
    Node next;
}
