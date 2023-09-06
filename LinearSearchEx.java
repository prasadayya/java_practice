import java.util.Scanner;
public class LinearSearchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter arreay length ");
        int length = scanner.nextInt();


        int[] arr = new int[length];


        System.out.println("Enter " + length + " elements:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.print("Enter the value to search: ");
        int searchValue = scanner.nextInt();


        boolean found = false;
        int foundIndex = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == searchValue) {
                found = true;
                foundIndex = i;
                break;
            }
        }


        if (found) {
            System.out.println("Value " + searchValue + " found at index " + foundIndex);
        } else {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

        scanner.close();
    }
}
