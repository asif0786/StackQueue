import java.sql.SQLOutput;

public class Stack {
    int arr[];//Storing element
    int top;
    int capacity;

    Stack(int size){
        arr = new int[size];//Initializing an array
        top = -1;//Initializing top
        capacity = size;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Element Inserted");
        arr[++top] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        System.out.println("Element Popped");
        return arr[top--];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity-1;
    }

    public void display(){
        for(int i = 0; i <= top;i++){
            System.out.println(arr[i] + " ; ");
        }
    }
}
