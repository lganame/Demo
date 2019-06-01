package lambda;

import java.util.function.BiFunction;

public class LambdaDemo_6 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> avgFunc = (a,b)->(a+b)/2;
        int avg = avgFunc.apply(3,5);
        System.out.println(avg);
    }
}
