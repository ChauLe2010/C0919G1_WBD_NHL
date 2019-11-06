import java.util.Scanner;

public class AddArray {
    int rootArray[] = new int[100];
    int size;

    void inputSize() {
        do {
            System.out.println("Input size of Array: ");
            Scanner sc = new Scanner(System.in);
            this.size = sc.nextInt();
        } while (this.size >= 100 || this.size < 0);
    }

    void inputArray() {
        for (int i = 0; i < this.size; i++) {
            System.out.println("a[" + i + "]=");
            Scanner sc = new Scanner(System.in);
            this.rootArray[i] = sc.nextInt();
        }
    }


    void insertElement(int valueInsert, int indexInsert) {


        if (indexInsert>= 0 && indexInsert <= this.size) {
            for (int i = this.size; i > indexInsert; i--) {
                this.rootArray[i] = this.rootArray[i - 1];
            }
            rootArray[indexInsert] = valueInsert;
            this.size++;
        } else {
            System.out.println("Vi tri khong hop le");
        }
    }


    void displayArray() {
        System.out.println("Mang sau khi chen: ");
        for (int i = 0; i < this.size; i++)
            System.out.print(this.rootArray[i] +" ");

    }


    public static void main(String[] args) {
        AddArray test = new AddArray();
        test.inputSize();
        test.inputArray();
        test.displayArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x du lieu: ");
        int x = scanner.nextInt();
        System.out.println("Nhap k vi tri ");
        int k = scanner.nextInt();
        test.insertElement(x, k);
        test.displayArray();


     /*   int[] list = new int[10];
        list={1, 2, 3, 4, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x du lieu: ");
        int x = scanner.nextInt();
        System.out.println("Nhap k, vi tri ");
        int k = scanner.nextInt();
        System.out.println("Mang ban dau: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i]+" ");

        if (k>=0 && k<=list.length) {
            for (int i = list.length; i > k; i--) {
                list[i] = list[i - 1];
            }
            list[k] = x;
            //n++;
        } else {
            System.out.println("Vi tri khong hop le");
        }
        System.out.println("Mang sau khi chen: ");
        for (int i = 0; i < list.length; i++)
          System.out.print(list[i] +" ");  */

    }

}
