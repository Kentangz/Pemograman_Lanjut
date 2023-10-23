package Lab.Modul2;

public class Circle {
    public static final double PHI = 3.14;
    private double r;

    public Circle(double radius){
        this.setR(radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        System.out.println("radius = " + circle.getR());
        System.out.println("area = " + getaArea(circle));
    }

    private static double getaArea(Circle circle) {
        return PHI * circle.getR() * circle.getR();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}