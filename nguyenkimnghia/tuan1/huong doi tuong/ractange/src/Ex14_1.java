import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong");
        double weight = scanner.nextDouble();
        System.out.println("nhap chieu cao");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(weight,height);
        System.out.println("hinh chu nhat cua ban " + rectangle.display());
        System.out.println("chu vi chu nhat cua ban la: " + rectangle.getPerimeter());
        System.out.println("dien tich hinh chu nhat cuar ban la: " + rectangle.getArea());
    }
}
