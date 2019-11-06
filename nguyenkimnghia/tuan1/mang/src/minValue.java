import java.util.Scanner;

public class minValue {
    public static int minValue(int[] array) {

        int min = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr;
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử: ");
        int element = scanner.nextInt();
        arr = new int[element];
        do {
            if (element > 20)
                System.out.println("không quá 20 phần tử");
        } while (element > 20);

        while (a < arr.length) {
            System.out.println("nhập giá trị cho phần tủ");
            arr[a] = scanner.nextInt();
            a++;
        }
        int index = minValue.minValue(arr);
        System.out.println("phần tử nhỏ nhất là: " + index);

    }
}
