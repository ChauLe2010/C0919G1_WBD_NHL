import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap  năm");
//        int year = sc.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " là năm nhuận");
//                } else {
//                    System.out.println(year + " không phải năm nhuận");
//                }
//            } else {
//                System.out.println(year + " là năm nhuận");
//            }
//        }else {
//            System.out.println(year + " không phải năm nhuận");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int year = scanner.nextInt();
        boolean bl = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    bl = true;
                }
            } else {
                bl = true;
            }
        }
        if (bl) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải năm nhuận");
        }
    }
}