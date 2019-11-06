
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập số phần tử của mảng firstNumberArray: ");
        int sizeOfFirstNumberArray = scanner.nextInt();
        System.out.println("Mời nhập giá trị các phần tử:");
        int[] firstNumberArray = new int[sizeOfFirstNumberArray];
        firstNumberArray = getElementValueInArray(firstNumberArray, sizeOfFirstNumberArray, "firstNumberArray");

        System.out.print("Mời nhập số phần tử của mảng secondNumberArray: ");
        int sizeOfSecondNumberArray = scanner.nextInt();
        System.out.println("Mời nhập giá trị các phần tử:");
        int[] secondNumberArray = new int[sizeOfSecondNumberArray];
        secondNumberArray = getElementValueInArray(secondNumberArray, sizeOfFirstNumberArray, "secondNumberArray");

        int[] mergeNumberArray = mergeArray(firstNumberArray, secondNumberArray, sizeOfFirstNumberArray+sizeOfSecondNumberArray);

        printArray(firstNumberArray);
        printArray(secondNumberArray);
        printArray(mergeNumberArray);
    }

    public static int[] getElementValueInArray (int[] arr, int size, String nameArr) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<arr.length; i++) {
            System.out.print(nameArr+"["+i+"] = ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray (int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeArray (int[] arr1, int[] arr2, int size) {
        int[] newArray = new int[size];
        int index = 0;
        for (int element:
                arr1) {
            newArray[index] = element;
            index++;
        }
        for (int element:
                arr2) {
            newArray[index] = element;
            index++;
        }
        return newArray;
    }
}