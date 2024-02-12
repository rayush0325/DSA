public class DoublyLinkedList {
    Node head;
    void insertAtBeg(int value){
        Node new_node=new Node();
        new_node.data=value;
        new_node.next=head;
        new_node.prev=null;
        if(head!=null){
            head.prev=new_node;
        }
        head=new_node;
    }
    void insertAtEnd(int value){
        Node new_node=new Node();
        new_node.data=value;
        new_node.next=null;
        if(head!=null) {
            Node temp;
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            new_node.prev=temp;
            temp.next=new_node;
        }
        else{
            new_node.prev=head;
            head=new_node;
        }
    }
    void insertAfter(int loc, int value){
        Node temp;
        temp=head;
        while(temp!=null && temp.data!=loc){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("node having value "+loc+" is absent in list");
        }
        else{
            Node new_node=new Node();
            new_node.data=value;
            new_node.next=temp.next;
            new_node.prev=temp;
            if (temp.next != null) {
                temp.next.prev=new_node;
            }
            temp.next=new_node;
        }
    }
    void insertBefore(int loc, int value){
        Node temp;
        temp=head;
        while(temp!=null && temp.data!=loc){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("node having value "+loc+" is absent in list");
        }
        else{
            Node new_node=new Node();
            new_node.data=value;
            new_node.next=temp;
            new_node.prev=temp.prev;
            if(temp.prev==null){
                head=new_node;
            }
            else{
                temp.prev.next=new_node;
            }
            temp.prev=new_node;
        }
    }
    void deleteAtBeg(){
        if(head==null){
            System.out.println("list empty");
        }
        else{
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
        }
    }
    void deleteAtEnd(){
        if(head==null){
            System.out.println("list empty");
        }
        else{
            Node temp=head;
            if(temp.next!=null){
                Node pretemp=temp;
                while(temp.next!=null){
                    pretemp=temp;
                    temp=temp.next;
                }
                pretemp.next=null;
            }
            else{
                head=null;
            }
        }
    }
    void printList(Node temp){
        int count=0;
        while(temp!=null){
            count++;
            System.out.print("node"+count+": "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        if(count==0){
            System.out.println("\nlist empty");
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAfter(10,100);
        list.insertAfter(30,110);
        list.insertAfter(60,120);
        list.insertAfter(90,130);
        list.insertBefore(30,140);
        list.insertBefore(40,150);
        list.insertBefore(120,160);
        list.insertBefore(1000,170);
        list.printList(list.head);
        
    }
}
class Node{
    int data;
    Node next;
    Node prev;
}
