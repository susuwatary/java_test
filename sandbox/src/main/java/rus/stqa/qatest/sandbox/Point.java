package rus.stqa.qatest.sandbox;

/**
 * Created by alena on 26.08.16.
 */
public class Point {
     public double x;
     public double y;


    public void distance(Point point2) {
        double distanceX = point2.x - x;
        double distanceX2 = Math.pow(distanceX, 2);
        double distanceY = point2.y - y;
        double distanceY2 = Math.pow(distanceY, 2);
        double sum = distanceX2 + distanceY2;
        double l = Math.sqrt(sum);
        System.out.println("Расстояние между точками Point1(" + x + ";" + y + ") и Point2(" + point2.x + ";" + point2.y + ") = " + l);
    }
}
