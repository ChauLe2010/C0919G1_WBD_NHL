package ss1;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so");
        int number = sc.nextInt();
        String string = "";
        if (number > 0 && number < 10) {
            string = ChuyenSoThanhChu.Chuyendoi(number);
        } else if (number < 20) {
            string = "muoi " + ChuyenSoThanhChu.Chuyendoi(number % 10);
        } else if (number < 100) {
            string = ChuyenSoThanhChu.Chuyendoi(number / 10) + " " + ChuyenSoThanhChu.Chuyendoi(number % 10);
        }
        System.out.println("" + string);
    }

    public static String Chuyendoi(int number) {
        String string = "";
        switch (number) {
            case 1:
                string = "mot";
                break;
            case 2:
                string = "hai";
                break;
            case 3:
                string = "ba";
                break;
            case 4:
                string = "bon";
                break;
            case 5:
                string = "nam";
                break;
            case 6:
                string = "sau";
                break;
            case 7:
                string = "bay";
                break;
            case 8:
                string = "tam";
                break;
            case 9:
                string = "chin";
                break;
        }
        return string;
    }
}


