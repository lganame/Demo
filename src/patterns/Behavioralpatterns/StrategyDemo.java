package patterns.Behavioralpatterns;
interface Strategy{
    int doOperation(int a,int b);
}
//ConcreteStrategy
class AddStrategy implements Strategy{
    public int doOperation(int a,int b){
        return a+b;
    }
}

//ConcreteStrategy
class SubstractStrategy implements Strategy{
    public int doOperation(int a, int b){
        return a-b;
    }
}

//Context
class Calc{
    Strategy strategy;
    public int execute(int a,int b){
        if(strategy == null)
            return 0;
        return strategy.doOperation(a,b);
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}


public class StrategyDemo {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result1 = calc.execute(5,3);
        System.out.println(result1);
        calc.setStrategy(new AddStrategy());
        int result2 = calc.execute(5,3);
        System.out.println(result2);
        calc.setStrategy(new SubstractStrategy());
        int result3 = calc.execute(5,3);
        System.out.println(result3);
    }

}
