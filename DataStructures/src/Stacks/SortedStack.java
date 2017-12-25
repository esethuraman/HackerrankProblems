package Stacks;

/**
 *  sort the stack in descending order(with largest item on top)
 *  Condition: can use one extra stack for buffer space. nothing else
 */

/**
 * a simple solution would be for every occurence
 */
public class SortedStack {

        Stack stack = new Stack();
        Stack sortedStack = new Stack();


    public static void main(String[] args) {
        SortedStack ss = new SortedStack();
        int[] arr = {5,2,4,6,3,1,8,9};
        ss.pushArrayElementsToStack(arr);
        ss.sortTheStack(ss.stack);
//        while(ss.stack.getSize()>0){
////            System.out.println(ss.stack.peek());
//            ss.stack.peek();
//            ss.stack.pop();
//        }
        System.out.println("Sorted stack ...");
        while(ss.sortedStack.getSize()>0){
            ss.sortedStack.peek();
            ss.sortedStack.pop();
        }
    }

    /**
     * only two stacks are to be used
     * @param stack
     */
    public void sortTheStack(Stack stack){
//        this holds every element of the original stack. this has to be
//        placed in the right position on stack 2
        int temp;

//        if the original stack is empty, all elements are placed in sorted
// stack
        while(!stack.isEmpty()){
//        storing top element in temp and performing pop
            temp = stack.peek();
            stack.pop();

//          populating sorted stack
            if(sortedStack.isEmpty()){
                sortedStack.push(temp);
            }
            else{
                while(!sortedStack.isEmpty()){
//                    if the top element of sorted stack is greater than
// temp, then temp is pushed in to sorted stack. and the inner loop terminates
                    if(sortedStack.peek() > temp){
                        sortedStack.push(temp);
                        break;
                    }
//                    otherwise, pop sorted stack element and push it to
// original stack
                    else{
                        stack.push(sortedStack.peek());
                        sortedStack.pop();
                    }
                }
            }

        }
    }

    private void pushArrayElementsToStack(int[] arr) {
        for(int element : arr){
            stack.push(element);
        }
    }
}
