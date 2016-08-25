package rus.stqa.qatest.sandbox;

import java.awt.*;

public class myFirstProgram {

  public static void main(String[] args) {
    String somebody = "world";
    System.out.println("Hello, " + somebody + "!");
    hello("Alena");

    Square s = new Square(5);
    System.out.println("Площадь квадрата = " + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоуголника = " + r.area() );

    double p1x = 4;
    double p1y = 4;
    double p2x = 9;
    double p2y = 9;
    System.out.println("Координаты точкек p1(" + p1x + ";" + p1y + ") и p2(" + p2x + ";" + p2y + ")");

    double p1 = p2x - p1x;
    double s1 = Math.pow(p1, 2);
    double p2 = p2y - p1y;
    double s2 = Math.pow(p2, 2);
    double sum = s1 +s2;
    double l = Math.sqrt(sum);
    System.out.println("Длинна точек p1(" + p1x + ";" + p1y + ") и p2(" + p2x + ";" + p2y + ") = " + l);





  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody +"!");
  }














}
