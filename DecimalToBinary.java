import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        String binary = "";
        while(num > 0){
         binary  = (num % 2)+ binary;
        num /=2;
        
}
   System.out.print(binary);
}
}