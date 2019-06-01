package patterns.Behavioralpatterns;

import Utils.Common;

//Invoker
class BankClient{
    private Command putCommand;
    private Command getCommand;
    public BankClient(Command cPut,Command cGet){
        putCommand = cPut;
        getCommand = cGet;
    }
    void putMoney(){
        putCommand.execute();
    }
    void getMoney(){
        getCommand.execute();
    }
}

//Receiver
class Bank{
    void giveMoney(){
        System.out.println("money to the client");
    }
    void receiveMonney(){
        System.out.println("money from the client");
    }
}

interface Command{
    void execute();
}

//ConcreteCommand
class PutCommand implements Command{
    private Bank bank;
    public PutCommand(Bank bank){
        this.bank = bank;
    }
    public void execute(){
        bank.receiveMonney();
    }
}

//ConcreteCommand
class GetCommand implements Command{
    private Bank bank;
    public GetCommand(Bank bank){
        this.bank = bank;
    }
    public void execute(){
        bank.giveMoney();
    }
}
public class BankDemo {
    //Client
    public static void main(String[] args) {
        Bank bank = new Bank();
        PutCommand cPut = new PutCommand(bank);
        GetCommand cGet = new GetCommand(bank);
        BankClient client = new BankClient(cPut,cGet);
        client.getMoney();
        //printed: money to the client
        client.putMoney();
        //printed money from the client
    }
}
