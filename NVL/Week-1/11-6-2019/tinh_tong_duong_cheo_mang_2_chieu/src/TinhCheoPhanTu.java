import java.util.Scanner;

public class TinhCheoPhanTu {


    public static void main(String[] args) {


        int array[][] = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = input.nextInt();

            }
        }

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }

        int tong = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (column == row) {
                    tong += array[row][column];

                }
            }
        }
        System.out.println("ket qua" + tong);

    }
}
