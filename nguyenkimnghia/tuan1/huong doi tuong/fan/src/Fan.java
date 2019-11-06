import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on_off = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on_off = on;
    }

    public final int getSLOW() {
        return SLOW;
    }
    public final int getMEDIUM() {
        return MEDIUM;
    }
    public final int getFAST() {
        return FAST;
    }
    private int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void setOn(boolean newStaus) {
        this.on_off = newStaus;
    }

    public boolean isOn() {
        return on_off;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String toString() {
        if(on_off) {
            return "Fan is on " + "speed is: " + getSpeed() + "radius is: " + getRadius() + "clolor is: " + getColor();
        } else {
            return "Fan is off " + "color is:" + getColor()+ "radius is: "+ getRadius();
        }
    }
}
