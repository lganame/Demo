package patterns.Behavioralpatterns;

import java.util.Stack;

class Point{
    public int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Memento{
    private Point state;
    public Memento(Point state){
        this.state = state;
    }
    public Point getState(){
        return state;
    }
}

//Originator
class Shape{
    public Point position = new Point(0,0);
    public void move(int left, int top){
        position.x += left;
        position.y += top;
    }
    public Memento getMemento(){
        Point state = new Point(position.x,position.y);
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        position = memento.getState();
    }
}

//Caretaker
class ShapeHelper{
    private Stack<Memento> stack = new Stack<Memento>();
    private Shape shape;
    public ShapeHelper(Shape shape){
        this.shape = shape;
    }
    public void move(int left, int top){
        stack.push(shape.getMemento());
        shape.move(left,top);
    }

    public void undo(){
        if(!stack.isEmpty()){
            shape.setMemento(stack.pop());
        }
    }
}
public class MementoDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        ShapeHelper helper = new ShapeHelper(shape);
        helper.move(2,3);
        helper.move(-5,4);
        helper.undo();
        helper.undo();
    }
}
