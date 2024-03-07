public class MyQueue {
    int front=-1;
    int rear=-1;
    final int size=100;
    int[] arr=new int[size];
    int capacity;
    MyQueue(int value){
        this.capacity=value;
    }
    public void enqueue(int value){
        if(rear<size-1 && (rear-front)+1<=capacity){
            if(front==-1){
                front++;
            }
            rear++;
            arr[rear]=value;
        }
    }
    public void dequeue(){
        if(front!=-1 && front<=rear){
            front++;
        }
        else{
            System.out.println("underflow");
        }
    }
    public boolean isEmpty(){
        return front==-1 || (rear-front)+1==0;
    }
    public void print(){
        if(this.isEmpty()){
            System.out.println("empty queue");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MyQueue queue=new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
//        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.dequeue();
//        queue.dequeue();
        queue.print();
        queue.enqueue(40);
        queue.print();
    }
}
