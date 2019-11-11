public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double length, double width, String color, boolean filler) {
        super(color,filler);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * this.length;
    }

    public double getPerimeter(){
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A rectangle with width = "
                + getWidth()
                + "and length "
                + getLength()
                +", which is a subclass of "
                +super.toString();
    }
}
