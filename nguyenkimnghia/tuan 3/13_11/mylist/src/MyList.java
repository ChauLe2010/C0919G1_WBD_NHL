import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<E> {
   private int num;
   private String color;
   private boolean i;

    public MyList() {
    }

    public MyList(int num, String color, boolean i) {
        this.num = num;
        this.color = color;
        this.i = i;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isI() {
        return i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "num=" + num +
                ", color='" + color + '\'' +
                ", i=" + i +
                '}';
    }
}
