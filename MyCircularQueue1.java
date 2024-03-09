public class MyCircularQueue1 {
    CircularQueueNode front;
    CircularQueueNode rear;
    public void enqueue(int value){
        CircularQueueNode new_node=new CircularQueueNode(value);
        if(front==null){
            front=new_node;
        }
        else{
            new_node.next=rear.next;
            rear.next=new_node;
        }
        rear=new_node;
    }
    public void dequeue() {
        if (front != null) {
            if (front == rear) {
                rear = null;
                front = null;
            } else {
                rear.next = front.next;
                front = front.next;
            }
        }
        else {
            System.out.println("queue empty");
        }
    }
        public void print(){
            if(front!=null) {
                CircularQueueNode temp;
                temp = front;
                while(true){
                    System.out.print(temp.data+" ");
                    if(temp==rear){
                        break;
                    }
                    temp=temp.next;
                }
                System.out.println();
            }
            else{
                System.out.println("empty queue");
            }
        }
    public static void main(String[] args) {
        MyCircularQueue1 queue=new MyCircularQueue1();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();

    }
}
class CircularQueueNode{
    int data;
    CircularQueueNode next;
    CircularQueueNode(int value){
        this.data=value;
        this.next=null;
    }
}
