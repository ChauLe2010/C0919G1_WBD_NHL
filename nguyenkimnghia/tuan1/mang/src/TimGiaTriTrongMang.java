import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
    String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
    Scanner input = new Scanner(System.in);
        System.out.println("nhập tên cần tìm");
        String input_name = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(input_name)){
                System.out.println("vị trí của các sinh viên " + input_name + " là " + (i + 1));
                break;
            }
        }
        if (isExist){
            System.out.println("không có sinh viên này");
        }
    }
}
