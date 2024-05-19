package stackx;
public class Main {
    public static void main(String[] args) {
        stackx stack = new stackx(10);

        // Push some numbers onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // Remove odd numbers from the stack
        removeOddNumbers(stack);

        // Print the remaining stack contents
        while (!stack.isEmpty()) {
        	
            System.out.println(stack.pop());
        }
    }

    public static void removeOddNumbers(stackx stack) {
    	stackx tempStack = new stackx(stack.getCount());

        // Transfer even numbers to the temporary stack
        while (!stack.isEmpty()) {
            int item = stack.pop();
            if (item % 2 == 0) {
                tempStack.push(item);
            }
        }

        // Transfer even numbers back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
