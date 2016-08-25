package rus.stqa.qatest.sandbox;

/**
 * Created by alena on 26.08.16.
 */
public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public  double area() {
        return this.a * this.b;
    }

}
