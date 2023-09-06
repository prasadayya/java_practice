import java.util.*;
public class StackExample {
     int maxSize;
     int[] stackArray;
     int top;
    public StackExample(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        } else {
            int poppedValue = stackArray[top--];
            System.out.println("Popped " + poppedValue + " from the stack.");
            return poppedValue;
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        } else {
            return stackArray[top];
        }
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        StackExample stack = new StackExample(size);
        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int valueToPush = scanner.nextInt();
                    stack.push(valueToPush);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1) {
                        System.out.println("Top element of the stack: " + topValue);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

