package patterns.Creational;
//prototype
class Shape implements Cloneable{
    public int lineCount;
    public Shape(int lineCount){
        this.lineCount = lineCount;
    }
    public Shape clone(){
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
//ConcreteProtype
class Square extends Shape{
    public Square(){
        super(4);
    }
}

class ShapeMaker{
    private Shape shape;
    public ShapeMaker(Shape shape){
        this.shape = shape;
    }
    public Shape makeShape(){
        return shape.clone();
    }
}
//
public class PrototypeDemo {
    public static void main(String[] args) {
        Square square = new Square();
        ShapeMaker maker = new ShapeMaker(square);
        Shape square1 = maker.makeShape();
        Square square2 = (Square)maker.makeShape();
    }
}
