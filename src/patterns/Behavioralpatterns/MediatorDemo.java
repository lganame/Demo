package patterns.Behavioralpatterns;

import java.util.ArrayList;
import java.util.List;

abstract class Mediator{
    protected List<Switcher> switchers = new ArrayList<>();
    abstract void sync(Switcher switcher);
    public void add(Switcher switcher){
        switchers.add(switcher);
    }
}
//Colleague
class Switcher{
    private boolean state;
    private Mediator mediator;
    public Switcher(Mediator mediator){
        this.mediator = mediator;
        mediator.add(this);
    }
    public void sync(){
        mediator.sync(this);
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean value){
        this.state = value;
    }
}


//ConcreteMediator
class SyncMediator extends Mediator {
    public void sync(Switcher switcher){
        Boolean state = switcher.getState();
        for(Switcher curSwitcher:switchers){
            curSwitcher.setState(state);
        }
    }
}


//Client
public class MediatorDemo {
    public static void main(String[] args) {
        SyncMediator mediator = new SyncMediator();
        Switcher switcher1 = new Switcher(mediator);
        Switcher switcher2 = new Switcher(mediator);
        Switcher switcher3 = new Switcher(mediator);
        switcher1.setState(true);
        boolean state2 = switcher2.getState();
        boolean state3 = switcher3.getState();
        switcher1.sync();
        state2 = switcher2.getState();
        state3 = switcher3.getState();
    }
}
