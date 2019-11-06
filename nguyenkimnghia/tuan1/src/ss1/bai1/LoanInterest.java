package bai1;

import java.util.Scanner;

public class LoanInterest {
    public static void main(String[] args) {
        double money = 1.0;
        int moth = 1;
        double interest_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        money = input.nextDouble();
        System.out.println("nhập số tháng gửi");
        moth = input.nextInt();
        System.out.println("nhập lãi xuất");
        interest_rate = input.nextDouble();
        Double total = 0;
        for (int i = 0; i < moth; i++) {
            total = money * (interest_rate / 100) / 12 * moth;

        }
        System.out.println("Total of interset: " + total);
    }
}
