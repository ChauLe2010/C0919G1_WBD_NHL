import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        chuoi = scanner.nextLine();
        char kyTu = 'a';
        int count = 0;
        try {
            System.out.println("nhập kí tụ cần đếm: ");
            kyTu = (char) System.in.read();
            System.out.println("kí tự vừa nhập : " + kyTu);
        } catch (Exception e) {
            System.out.println("không có kí tự này!");
        }

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
