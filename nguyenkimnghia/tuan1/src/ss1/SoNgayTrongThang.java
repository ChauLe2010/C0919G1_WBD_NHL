import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = a.nextInt();
        switch (month){
            case 2:
                System.out.print("28 or 29");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("30");
                break;
            default:
                System.out.printf("invalid input");
                break;
        }
    }
}
