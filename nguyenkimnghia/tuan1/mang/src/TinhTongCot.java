import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        int[][] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập độ dài của mảng");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("không được qua 10 phần tử: ");
            }
        } while (size > 10);
        array = new int[size][size];
            for (int i = 0; i < array.length;i ++){
                for (int j = 0; j < array[i].length; j++){
                    System.out.println("nhạp các phần thủ của mảng");
                    int nhap = scanner.nextInt();
                    array[i][nhap] = nhap;
                }
            }

//        int a = scanner.nextInt();
//        int total = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i == a - 1)
//                for (int j = 0; j < array[i].length; j++) {
//                    total += array[j][a - 1];
//                }
//        }
//        System.out.println(total);
    }
}
