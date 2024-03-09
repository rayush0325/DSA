public class MyCircularQueue {
    int front=-1;
    int rear=-1;
    int size;
    int[] arr;
    MyCircularQueue(int x){
        this.size=x;
        arr=new int[size];
    }
    public void enqueue(int value){
        if((rear+1)%size!=front){
            if(front==-1){
                front++;
            }
            rear=(rear+1)%size;
            arr[rear]=value;
            System.out.println("queue "+value);
        }
        else{
            System.out.println("queue overflow");
        }
    }
    public void dequeue(){
//        System.out.println("front= "+front+" rear="+rear);
        if((front!=-1)){
            if(front!=rear) {
                front = (front + 1) % size;
            }
            else{
                front=-1;
                rear=-1;
            }
            System.out.println("dequeue");
        }
        else{
            System.out.println("empty queue");
        }
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public void print(){
        if(!this.isEmpty()){
            int i=front;
            while(true){
                System.out.print(arr[i]+" ");
                if(i==rear){
                    break;
                }
                i=(i+1)%size;
            }
            System.out.println();
        }
        else{
            System.out.println("empty queue");
        }
    }

    public static void main(String[] args) {
        MyCircularQueue queue=new MyCircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.print();
        queue.dequeue();
        queue.dequeue();

        queue.print();
        queue.enqueue(60);
        queue.enqueue(70);

        queue.print();

    }
}
