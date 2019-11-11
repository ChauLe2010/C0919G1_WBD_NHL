import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(10.0,5.0);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(5.0,3.0,"red",true);

        System.out.println("mang dau tien");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        Comparator comparator = new RectangleComparator();
        Arrays.sort(rectangles,comparator);

        System.out.println("mang da sap xep");
        for (Rectangle rectangle: rectangles){
            System.out.println(rectangle);
        }
    }
}
