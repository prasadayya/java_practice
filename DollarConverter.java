import java.util.Scanner;

public class DollarConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in dollars: ");
        double dollars = scanner.nextDouble();

        
        double exchangeRate = 82.65; 
        double rupees = dollars * exchangeRate;

        System.out.println(dollars + " dollars is equal to " + rupees + " rupees.");

       
    }
}




