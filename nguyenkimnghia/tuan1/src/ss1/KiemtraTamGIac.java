package ss1;

import java.util.Scanner;

public class KiemtraTamGIac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh 1: ");
        int canh1 = scanner.nextInt();
        System.out.println("nhap canh 2: ");
        int canh2 = scanner.nextInt();
        System.out.println("nhap canh 3: ");
        int canh3 = scanner.nextInt();
        try {
            if ((canh1 < 0 || canh2 < 0 || canh3 < 0) || (canh1 + canh2 <= canh3) || (canh1 + canh3 <= canh2) || (canh2 + canh3 <= canh1)) {
            }else {
                System.out.println("La 3 canh mot tam giac");
            }

        } catch (ArithmeticException e) {
            System.out.println("Khong Phai 3 canh mot tam giac");
        }

    }
}
