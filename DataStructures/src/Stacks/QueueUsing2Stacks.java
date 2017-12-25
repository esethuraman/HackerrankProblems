package Stacks;

/**
 * implementing FIFO queue structure using two stacks
 */
public class QueueUsing2Stacks {
    Stack stack1, stack2;

    QueueUsing2Stacks(){
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void enqueue(int value){
        stack1.push(value);
    }

    public int dequeue(){
        int temp, dequeuedValue;
        while(!stack1.isEmpty()){
            temp = stack1.peek();
            stack1.pop();
            stack2.push(temp);
        }

        dequeuedValue = stack2.peek();
        stack2.pop();

        while(!stack2.isEmpty()){
            temp = stack2.peek();
            stack2.pop();
            stack1.push(temp);
        }
        return dequeuedValue;
    }

    public static void main(String[] args) {
        QueueUsing2Stacks queue = new QueueUsing2Stacks();
        for(int i=0; i<10; i++){
            queue.enqueue(i);
        }
        System.out.println("DEQUEUEING .... ");
        for(int i=0; i<10; i++){
            System.out.println(queue.dequeue());
        }
    }
}
