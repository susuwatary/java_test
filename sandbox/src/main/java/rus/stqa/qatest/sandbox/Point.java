package rus.stqa.qatest.sandbox;

/**
 * Created by alena on 26.08.16.
 */
public class Point {
     public double x1;
     public double y1;
     public double x2;
     public double y2;

    public Point(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double area() {
        double distanceX = this.x1 - this.x2;
        double distanceX2 = Math.pow(distanceX, 2);
        double distanceY = this.y1 - this.y2;
        double distanceY2 = Math.pow(distanceY, 2);
        double sam = distanceX2 + distanceY2;
        double zl = Math.sqrt(sam);
        return zl;
        //System.out.println("Площадь прямоуголника = " + zl );




    }



   /*public void distance(Point point2) {
        double distanceX = point2.x - x;
        double distanceX2 = Math.pow(distanceX, 2);
        double distanceY = point2.y - y;
        double distanceY2 = Math.pow(distanceY, 2);
        double sum = distanceX2 + distanceY2;
        double l = Math.sqrt(sum);
        System.out.println("Расстояние между точками Point1(" + x + ";" + y + ") и Point2(" + point2.x + ";" + point2.y + ") = " + l);



    }*/

}
