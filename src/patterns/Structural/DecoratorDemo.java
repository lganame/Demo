package patterns.Structural;
//Component
interface IShape{
    //Operation()
    void showInfo();
}
//ConcreteComponent
class Square_2 implements IShape{
    public void showInfo(){
        System.out.println("square");
    }
}
//Decorator
abstract class ShapeDecorator implements IShape{
    protected IShape shape;
    public ShapeDecorator(IShape shape){
        this.shape = shape;
    }
    //Operation()
    public void showInfo(){
        shape.showInfo();
    }
}

//ConcreteDecorator
class ColorShape extends ShapeDecorator{
    protected String color;
    public ColorShape(IShape shape,String color){
        super(shape);
        this.color = color;
    }
    @Override
    public void showInfo(){
        System.out.println(color+" ");
        shape.showInfo();
    }
}

//ConcreteDecorator
class ShadowShape extends ShapeDecorator{
    public ShadowShape(IShape shape){
        super(shape);
    }
    @Override
    public void showInfo(){
        shape.showInfo();
        System.out.println(" with shadow");
    }
}




public class DecoratorDemo {
    public static void main(String[] args) {
        //Client
        Square_2 square = new Square_2();
        square.showInfo();
        System.out.println();

        ColorShape colorShape = new ColorShape(square,"red");
        colorShape.showInfo();
        //printed red square
        System.out.println();

        ShadowShape shadowShape = new ShadowShape(colorShape);
        shadowShape.showInfo();
    }
}
