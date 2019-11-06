import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;
        System.out.println("mảng chưa xóa");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử muốn xóa");
        int sc = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sc) {
                array[i] = array[i + 1];
            }
            System.out.println("mảng đã xóa là : " + array[i]);
        }
    }

}
