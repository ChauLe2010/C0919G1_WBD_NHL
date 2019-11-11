public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filler) {
        super(side, side, color, filler);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which subclass of "
                + super.toString();
    }
}
