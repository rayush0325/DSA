public class CircularLinkedList {
    Node last;
    void insertAtBeg(int value){
        Node new_node=new Node(value);
        if(last==null){
            last=new_node;
            new_node.next=last;
        }
        else{
            new_node.next=last.next;
            last.next=new_node;
        }
    }
    void insertAtEnd(int value){
        Node new_node=new Node(value);
        if(last==null){
            last=new_node;
            new_node.next=last;
        }
        else{
            new_node.next=last.next;
            last.next=new_node;
            last=new_node;
        }
    }
    void insertAfter(int loc, int value){
        if(last==null){
            System.out.println("list empty");
        }
        else{
            Node temp=last;
            while(temp.data!=loc){
                temp=temp.next;
                if(temp==last){
                    break;
                }
            }
            if(temp==last){
                System.out.println("node having value "+loc+" is absent");
            }
            else{
                Node new_node=new Node(value);
                new_node.next=temp.next;
                temp.next=new_node;
            }
        }
    }
    void printList(){
        if(last==null){
            System.out.println("empty list");
        }
        else{
            Node temp=last.next;
            int count=0;
            while(true){
                count++;
                System.out.print(temp.data+" ");
                temp=temp.next;
                if(temp==last.next){
                    break;
                }
            }

        }
    }
    public static void main(String[] args) {
        CircularLinkedList list=new CircularLinkedList();
        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAfter(10,100);
        list.insertAfter(70,100);
        list.printList();
    }
}
class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
    }
}
