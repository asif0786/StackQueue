import java.sql.SQLOutput;

public class Queue {
    int arr[];//Storing element
    int front;
    int rear;
    int capacity;

    Queue(int size){
        arr = new int[size];//Initializing an array
        rear = -1;//Initializing top
        front = -1;
        capacity = size;
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Element Inserted");
        arr[++rear] = x;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        System.out.println("Element Popped");
        return arr[front--];
    }

    private boolean isEmpty() {
        return rear == -1;
    }

    private boolean isFull() {
        return rear == capacity-1;
    }

    public void display(){
        for(int i = 0; i <= rear;i++){
            System.out.println(arr[i] + " ; ");
        }
    }
}
