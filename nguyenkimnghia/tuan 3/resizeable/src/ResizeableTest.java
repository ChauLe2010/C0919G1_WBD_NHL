public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape: shapes){
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Circle: S= "+((Circle) shape).getArea());
            } if (shape instanceof Rectangle) {
                System.out.println("Rectangle: S= "+((Rectangle) shape).getArea());
            } if (shape instanceof Square){
                System.out.println("Square: Side= "+((Square) shape).getSide());
            }
        }

        System.out.println("\n");

        int x = (int) (Math.random() * 100);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(x);
            }if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(x);
            }if (shape instanceof Square){
                ((Square) shape).resize(x);
            }
            System.out.println(shape);
        }
    }
}
