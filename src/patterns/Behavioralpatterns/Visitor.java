package patterns.Behavioralpatterns;

import javax.lang.model.util.Elements;

interface Element{
    void accept(CarVisitor v);
}
//ConcreteElements
class Engine implements Element {
    public void accept(CarVisitor v){
        v.visit(this);
    }
}
//ConcreteElement
class Wheel implements Element{
    private int number;
    public Wheel(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void accept(CarVisitor v){
        v.visit(this);
    }
}

//ConcreteElement
class Car implements Element{
    private Element[] items = {
            new Engine(),
            new Wheel(1),new Wheel(2),
            new Wheel(3),new Wheel(4)
    };
    public void accept(CarVisitor v){
        for(Element e:items){
            e.accept(v);
        }
        v.visit(this);
    }
}

//Visitor
interface CarVisitor{
    void visit(Engine engine);
    void visit(Wheel wheel);
    void visit(Car car);
}

//ConcreteVisitor
class TestCarVisitor implements CarVisitor{
    public void visit(Engine engine){
        System.out.println("test engine");
    }
    public void visit(Wheel wheel){
        System.out.println("test wheel # "+wheel.getNumber());
    }
    public void visit(Car car){
        System.out.println("test Car");
    }
}

//ConcreteVisitor
class RepairCarVisitor implements CarVisitor{
    public void visit(Engine engine){
        System.out.println("repair engine");
    }
    public void visit(Wheel wheel){
        System.out.println("repair wheel #"+wheel.getNumber());
    }
    public void visit(Car car){
        System.out.println("repair car");
    }
}
public class Visitor {
    public static void main(String[] args) {
        Car car = new Car();
        CarVisitor v1 = new TestCarVisitor();
        CarVisitor v2 = new RepairCarVisitor();
        car.accept(v1);
        car.accept(v2);
    }
}
