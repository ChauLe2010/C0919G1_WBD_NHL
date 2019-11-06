import java.util.Scanner;


public class TestW1 {
    public static void main(String[] args) {

        int[][] matrix = new int[2][2];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
}
