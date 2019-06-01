package lambda;
//with multiple operators
import java.util.function.BiFunction;

class Point{
    public double x;
    public double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}
public class LambdaDemo_7 {
    public static void main(String[] args) {
        BiFunction<Point,Point,Double> getDistance = (p1,p2) ->
        {
            double d1 = Math.pow(p1.x-p2.x,2);
            double d2 = Math.pow(p1.y-p2.y,2);
            return Math.sqrt(d1+d2);
        };
        Point point1 = new Point(0,0);
        Point point2 = new Point(5,5);
        Double distance = getDistance.apply(point1,point2);
        System.out.println(distance);
    }
}
