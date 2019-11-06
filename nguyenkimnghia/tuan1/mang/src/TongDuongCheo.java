public class TongDuongCheo {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        for (int i = 0; i < array.length; i++) {
            total1 += array[i][i];
        }
        System.out.println("tổng đường chéo từ trái sang phải = " + total1);
        for (int j = array.length - 1; j >= 0; j--) {
            total2 += array[j][j];
        }
        System.out.println("tổng đường chéo từ phải sang trái = " + total2);
    }
}
