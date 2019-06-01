package patterns.Structural;
//Complex parts
class Kettle{
    void turnOff(){
        System.out.println("Kettle turn off");
    }
}

class Toaster{
    void turnOff(){
        System.out.println("Toast turn off");
    }
}

class Refrigerator{
    void turnOff(){
        System.out.println("Refrigerator turn off");
    }
}

//Facade
class Kitchen{
    Kettle kettle;
    Toaster toaster;
    Refrigerator refrigerator;
    public Kitchen(Kettle kettle,Toaster toaster,Refrigerator refrigerator){
        this.kettle = kettle;
        this.toaster = toaster;
        this.refrigerator = refrigerator;
    }
    void off(){
        kettle.turnOff();
        toaster.turnOff();
        refrigerator.turnOff();
    }
}
public class FacadeDemo {
    public static void main(String[] args) {
        Kettle kettle = new Kettle();
        Toaster toaster = new Toaster();
        Refrigerator refrigerator = new Refrigerator();
        Kitchen kitchen = new Kitchen(kettle,toaster,refrigerator);
        kitchen.off();
    }
}
