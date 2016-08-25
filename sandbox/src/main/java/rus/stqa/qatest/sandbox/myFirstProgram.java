package rus.stqa.qatest.sandbox;

public class myFirstProgram {

  public static void main(String[] args) {
    String somebody = "world";
    System.out.println("Hello, " + somebody + "!");
    double l = 0.4;
    double s = l * l;
    System.out.println("Площадь квадрата со стороной " + l + " = " + s);
    hello("Alena");

    double len = 5;
    System.out.println("Площадь квадрата = " + area(len) );

    double a = 4;
    double b = 5;

    System.out.println("Площадь прямоуголника = " + area(a, b) );


  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody +"!");
  }

  public static double area (double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }



}
