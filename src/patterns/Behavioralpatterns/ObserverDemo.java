package patterns.Behavioralpatterns;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String state);
}

//ConcreteObserver
class TextObserver implements Observer{
    private String name;
    protected TextObserver(String name){
        this.name = name;
    }
    public void update(String state){
        System.out.println(name +": "+state);
    }
}

//Subject
abstract class TestSubject{
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }
    public void notify(String state){
        for(Observer observer:observers){
            observer.update(state);
        }
    }
}
//ConcreteSubject
class TextEdit extends TestSubject{
    private String text = "";
    //SetState(State)
    public void setText(String text){
        this.text = text;
        notify(text);
    }
    public String getText(){
        return text;
    }
}
//ConcreteSubject



public class ObserverDemo {
    public static void main(String[] args) {
       //Client
       TextObserver observer1 = new TextObserver("Observer #1");
       TextObserver observer2 = new TextObserver("Observer #2");
       TextEdit textEdit = new TextEdit();
       textEdit.attach(observer1);
       textEdit.attach(observer2);
       textEdit.setText("test text");
    }
}
