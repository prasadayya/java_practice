import java.util.*;
public class Tables {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
System.out.println("please enter a number");
  int num = sc.nextInt();
  for (int i = 1; i<=10; i++){
   int result = num*i;
   System.out.println(num + " * "+i+" = "+result);
  
  }
  } 
}
