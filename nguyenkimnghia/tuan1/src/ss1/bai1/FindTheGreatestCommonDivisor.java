package bai1;

import java.util.Scanner;

public class FindTheGreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a");
        a = scanner.nextInt();
        System.out.println("nhập số b");
        b  = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("không có ước số chung");
        }
        while (a != b){
            if (a > b){
                a = a -b;
            }else {
                b = b - a;
            }
        }
        System.out.println("ước chung lớn nhất: " + a);
    }
}
