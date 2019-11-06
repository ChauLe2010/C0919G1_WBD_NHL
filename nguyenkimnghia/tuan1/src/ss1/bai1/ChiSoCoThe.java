package bai1;

import java.util.Scanner;

public class ChiSoCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height,weight,bmi;
        System.out.println("nhạp cân  nặng(kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("nhập chiều cao(meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.println( bmi + "bạn quá gầy");
        else if (bmi < 25.0)
            System.out.println(bmi + "bạn cân đối");
        else if (bmi < 30.0)
            System.out.println(bmi +"bạn hơi béo");
        else
            System.out.println(bmi + "qua béo");
    }
}
