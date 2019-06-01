package patterns.Behavioralpatterns;
abstract class Shape_2{
    //Template method
    void draw(){
        if(!canDraw()) return;
        doDraw();
        notifyListeners();
    }
    boolean canDraw(){
        //If it possible to draw the shape
        return true;
    }

    //primitive operation
    protected abstract void doDraw();

    void notifyListeners(){
        System.out.println("shape is drawn");
    }
}
class Circle extends Shape_2{
    protected void doDraw(){
        System.out.println("draw a circle");
    }
}
public class TemplateMethodDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}
