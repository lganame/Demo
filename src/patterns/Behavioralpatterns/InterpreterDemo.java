package patterns.Behavioralpatterns;
//AbstractExpression
interface  Expression{
    boolean interpret(int i);
}
//TerminalExpression
class DivExpression implements Expression{
    private int divider;
    public DivExpression(int divider){
        this.divider = divider;
    }
    public boolean interpret(int i){
        return i%divider == 0;
    }
}

//NonterminalExpression
class OrExpression implements Expression{
    private Expression exp1;
    private Expression exp2;
    public OrExpression(Expression exp1,Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    public boolean interpret(int i){
        return exp1.interpret(i)||exp2.interpret(i);
    }
}

class AndExpression implements Expression{
    private Expression exp1;
    private Expression exp2;
    public AndExpression(Expression exp1,Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
    public boolean interpret(int i){
        return exp1.interpret(i)&&exp2.interpret(i);
    }
}
public class InterpreterDemo {
    public static void main(String[] args) {
        //Client
        Expression divExp5 = new DivExpression(5);
        Expression divExp7 = new DivExpression(7);
        Expression orExp = new OrExpression(divExp5,divExp7);
        Expression andExp = new AndExpression(divExp5,divExp7);

        //21 is divided by 7 or 5?
        Boolean result1 = orExp.interpret(21);
        //result1 is true
        System.out.println(result1);
        Boolean result2 = andExp.interpret(21);
        System.out.println(result2);
        //result is false;
        Boolean result3 = andExp.interpret(35);
        System.out.println(result3);
        //result is true
    }
}
