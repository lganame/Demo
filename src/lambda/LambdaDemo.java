package lambda;
//Demonstratea simple lambda expression
//A functional interface.
interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String args)
    {
        MyNumber myNum; //declare an interface reference.
        //Here, the lambda expression is simply a constant expression,
        //When it is assigned to myNum, a class instance is constructed in which the lambda expresssion implements
        //teh getValu() method in MyNumber
        myNum = ()->123.45;
        //Call getValue(),which is providedby the previously assined lambda expression.sout
        System.out.println("A fixed value: "+myNum.getValue());

        //Here, a more complex expression is used
        myNum = ()->Math.random()*100;

        //These call the  lambda expression in the previous line.
        System.out.println("A random value: "+myNum.getValue());
        System.out.println("Another  randomm value: "+myNum.getValue());

        //A lambda expression must be compatible with the method defined by the functional interface. Therefore,this won't wor:
        //myNm = () -> "123.03";VS```````````1WWW11


    }
}
