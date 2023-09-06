import java.util.*;
public class AdditionOfNumber {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
System.out.println("please enter a number");
  int num = sc.nextInt();
int rev = 0;
int sum = 0;
  for (num ; num != 0; num /= 10) {
            int digit = num % 10;
            rev= rev * 10 + digit;
            sum += digit;

      
        }
System.out.println(sum);


}
}