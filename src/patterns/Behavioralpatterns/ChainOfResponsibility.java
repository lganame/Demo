package patterns.Behavioralpatterns;
/*
//Handler
abstract class Rescuer{
    protected Rescuer next;
    protected int code;
    //HandleRequest()
    void help(int code){
        if(this.code == code){
            toHelp();
        }else if(next != null){
            next.help(code);
        }
    }
    abstract void toHelp();
}

//ConcreteHandler
class Firefighter extends Rescuer{
    public Firefighter(Rescuer next){
        this.next = next;
        this.code = code;
    }
    protected void toHelp(){
        System.out.println("call firefighters");;
    }
}

//ConcreteHandler
class Police extends Rescuer{
    public Police(Rescuer next){
        this.next = next;
        this.code = 2;
    }
    protected void toHelp(){
        System.out.println("call the police");
    }
}

//ConcreteHandler
class Ambulance extends Rescuer{
    public Ambulance(Rescuer next){
        this.next = next;
        this.code = 3;
    }
    protected void toHelp(){
        System.out.println("call an ambulance");
    }
}
public class ChainOfResponsibility {
    public static void main(String[] args) {
        Ambulance ambulance = new Ambulance(null);
        Police police = new Police(ambulance);
        Firefighter firefighter = new Firefighter(police);
        firefighter.help(1);
        //
        firefighter.help(2);
        firefighter.help(3);

    }
}
*/