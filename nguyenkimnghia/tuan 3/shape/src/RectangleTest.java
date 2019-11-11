public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0,10.0);
        System.out.println(rectangle);

        rectangle = new Rectangle(5.0,10.0,"orange",false);
        System.out.println(rectangle);
    }
}
