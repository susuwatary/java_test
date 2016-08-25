package rus.stqa.qatest.sandbox;

public class myFirstProgram {

  public static void main(String[] args) {
    String somebody = "world";
    System.out.println("Hello, " + somebody + "!");
    hello("Alena");


    Square s = new Square(5);
    System.out.println("Площадь квадрата = " + s.area());



    Rectangle r = new Rectangle(4, 6);



    System.out.println("Площадь прямоуголника = " + r.area() );


  }

  public static void hello(String somebody) {
    System.out.println("Hello," + somebody +"!");
  }











}
