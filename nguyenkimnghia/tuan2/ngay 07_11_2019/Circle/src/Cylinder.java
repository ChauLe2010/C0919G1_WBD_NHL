public class Cylinder extends Circle {
    private double radius = 10.0;
    private String color = "red";
    private double height = 20.0;

    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height){
        this.radius = radius;
        this.color = color;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ban kinh cua hinh tru = " + getRadius()
                + ", mau sau la : " + getColor()
                + " chieu cao cua duong tron la: " + getHeight();
    }
}
