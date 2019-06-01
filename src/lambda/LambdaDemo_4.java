package lambda;

import java.util.function.BiFunction;

public class LambdaDemo_4  {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> MakeSum = (a,b)->{return a+b;};
            //return (a,b)->a + b;

        BiFunction sumFunc  = MakeSum;
        int sum = (int) sumFunc.apply(5,8);
        System.out.println(sum);
    }

}
