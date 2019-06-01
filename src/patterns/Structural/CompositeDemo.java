package patterns.Structural;

import java.util.ArrayList;
import java.util.List;

//Comonent
interface Graphic {
    void draw();
}
//Leaf
class Circle implements Graphic{
    public void draw(){
        System.out.println("Draw circle");
    }
}

//leaf
class Square implements Graphic{
    public void draw(){
        System.out.println("Draw square");
    }
}

//Composite
class Image implements Graphic{
    List<Graphic> graphics = new ArrayList<>();
    public void add(Graphic graphic){
        graphics.add(graphic);
    }

    public boolean remove(Graphic graphic){
        return graphics.remove(graphic);
    }
    public void draw(){
        for(Graphic graphic:graphics){
            graphic.draw();
        }
    }
}
public class CompositeDemo {
    //Client
    public static void main(String[] args) {
        Image image = new Image();
        image.add(new Circle());
        image.add(new Square());
        Image picture = new Image();
        picture.add(image);
        picture.add(new Image());
        picture.draw();
    }
}

