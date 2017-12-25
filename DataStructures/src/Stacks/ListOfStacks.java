package Stacks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * this programs creates multiple stacks
 * basically the user would push as many elements wished
 * however, when a threshold is reached, new stack is created.
 * all these stacks are stored in set
 */
public class ListOfStacks {

//    Set<Stack> stackSet = new HashSet<>();
    List<Stack> stackList = new ArrayList<>();

    Stack stack;
    public void pushElements(){
        int maxSizeStack = 10;

        for(int i = 0; i<100; i++){
            if(stackList.size() == 0 ||
                    stack.getSize()==maxSizeStack){
                System.out.println(i);
                stack = new Stack();
                stackList.add(stack);
            }
            stack.push(i);
        }
    }

//    Functions like normal pop for the user.
//    internally, pop from the last stack one by one
//    and when each stack gets emptied, remove the stack from list
    public void popElements(){
        if(stackList.size() > 0){
//            get last stack
            Stack lastStack = stackList.get((stackList.size()-1));
            lastStack.pop();

//            whenever the stack turns out to be empty, remove it from the list
            if(lastStack.getSize() == 0){
                stackList.remove(stackList.size()-1);
            }
        }

    }

    public int peekElements(){
        if(stackList.size()>0){
            return stackList.get(stackList.size()-1).peek();
        }
        else{
            return -9999;
        }
    }

//    performs pop operation on the stack located at the given index in the list
    public void popAt(int index){
        Stack localStack = stackList.get(index);
        localStack.pop();
    }

    public static void main(String[] args) {
        ListOfStacks ms = new ListOfStacks();
        ms.pushElements();
        System.out.println("Number of stacks created " + ms.stackList.size());

        ms.popAt(6);
       /* for(Stack stack : ms.stackList){
            System.out.println(stack.getSize());
        }
*/
       int popCount = 0;
       for(int i=0; i<100;i++){
           ms.peekElements();
           ms.popElements();
           popCount++;
       }
        System.out.println("Number of elements popped " + popCount);

    }
}
