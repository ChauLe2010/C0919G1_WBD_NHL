import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(10.0);
        squares[1] = new Square();
        squares[2] = new Square(5.0, "blue", false);

        System.out.println("mang dau tien");
        for (Square square : squares){
            System.out.println(square);
        }

        Comparator comparator = new SquareComparator();
        Arrays.sort(squares,comparator);

        System.out.println("mang da sap xep");
        for (Square square : squares){
            System.out.println(square);
        }
    }
}
