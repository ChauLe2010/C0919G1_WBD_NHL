public class QuadraticEquation {
        private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4*this.a*this.c;
    }
    private double getRoot1() {
        return ((-this.b + Math.sqrt(getDiscriminant()))/ (2*this.a));
    }
    private double getRoot2() {
        return ((-this.b - Math.sqrt(getDiscriminant()))/ (2*this.a));
    }
    String display() {
        if (getA() == 0 && getB() == 0 && getC() == 0) return "phuong trinh co vo so nghiem";
        else if (getDiscriminant() > 0)
            return "phuong trinh co 2 nghiem: " + getRoot1() + " and " + getRoot2();
        else if (getDiscriminant() == 0)
            return "phuong trinh co 1 nghiem " + getRoot1();
        return "phuong trinh vo nghiem: ";
    }
}
