package Stacks;

public class Stack {
    LinkList lst;
    Stack(){
        lst = new LinkList();
    }

    public void push(int value){
        lst.addNodeToTop(value);
    }

    public void pop(){
        lst.removeTopNode();
    }

    public int peek(){
//        System.out.println(lst.returnTopNodeValue());
        return lst.returnTopNodeValue();
    }

    public int getMin(){
        return lst.getMinimumStackValue();
    }

    public int getSize(){
        return lst.size;
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(21);
        stack.peek();
        stack.push(12);
        stack.push(4);
        stack.push(7);

        System.out.println("Before pop .. ");
        stack.peek();

        System.out.println("Minimum value in stack  .. ");
        System.out.println(stack.getMin());
        System.out.println("Pop in progress ... ");
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
//        stack.pop();
    }

}
