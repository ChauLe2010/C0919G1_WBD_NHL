import java.util.Scanner;

public class InputAndDisplayResultEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a");
        double a = scanner.nextDouble();
        System.out.println("nhap so b");
        double b = scanner.nextDouble();
        System.out.println("nhap so c");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
    }
}
