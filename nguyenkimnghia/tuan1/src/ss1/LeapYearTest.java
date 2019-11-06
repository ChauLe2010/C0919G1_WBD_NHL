package ss1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
     try {
         System.out.println("numerator: ");
         int numerator = scanner.nextInt();
         System.out.println("denominator: ");
         int denominator = scanner.nextInt();
         int result = numerator/denominator;
         System.out.println(result );
     }catch (InputMismatchException e){
         System.out.println("input error");
     }catch (ArithmeticException e){
         System.out.println("arithemtic error");
     }
    }
}