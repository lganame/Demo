package patterns.Behavioralpatterns;



interface State{
    void open(Connection c);
    void close(Connection c);
}

//ConcreteState
class CloseState implements State{
    public void open(Connection c){
        System.out.println("open the connection");
        c.setState(new OpenState());
    }
    public void close(Connection c){
        System.out.println("connection is already closed");
    }
}

//ConcreteState
class OpenState implements State{
    public void open(Connection c){
        System.out.println("connection is already open");
    }
    public void close(Connection c){
        System.out.println("close the connection");
        c.setState(new CloseState());
    }
}

//Context
class Connection{
    private State state = new CloseState();
    public void open(){
        state.open(this);
    }
    public void close(){
        state.close(this);
    }
    public void setState(State state){
        this.state = state;
    }
}

public class StateDemo {
    public static void main(String[] args) {
        //Client
        Connection con = new Connection();
        con.open();
        con.open();
        con.close();
        con.close();
    }
}
