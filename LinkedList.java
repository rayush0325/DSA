public class LinkedList {
    //default constructor initializes class variable-head of type-Node with default value-null
    Node head;
    //now the value of head is null
    void insertNode(int value){
        //non-static variable head accessible in non-static method insertNode
        Node node=new Node();
        node.data=value;
        node.next=head;
        head=node;
    }
    public static void main(String[] args) {
        //non-static method insetNode is accessible in static method by creating an object of class-LinkedList
        LinkedList list=new LinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        Node temp=list.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class Node{
    int data;
    Node next;
}
class NodeCreation{

}
