import java.util.Scanner;

public class ValueMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhâp kích thước: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("kích thước không quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập phần tử " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("nhập  kích thước: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("số lớn nhất là " + max + "tại vị trí " + index);
    }
}
