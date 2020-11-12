import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan= new Scanner(System.in);
  
  System.out.println("Enter your first number");
  double num1 = scan.nextDouble();

  System.out.println("Enter your second number");
  double num2= scan.nextDouble();

  double x =((num1+num2)/2);
  System.out.println("The average of these two numbers is "+x);
  }
}