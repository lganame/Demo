package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

//柯里化_currying
public class LambdaDemo_8 {
    /*
    public static void main(String[] args) {
        Function<Integer, Function<Integer,Integer>> Carry(BiFunction<Integer,Integer,Integer> f){
            return a->b->f.apply(a,b);
        }
        BiFunction<Integer,Integer,Integer> avg = (a,b)->(a+b)/2;
        Integer n1 = avg.apply(1,3);
        //first universal method
        Function<Integer,Integer> avg1 = Carry(avg).apply(1);
        //avg1 is avg func with first param = 1
        int n2  avg1.apply(3);
        //n2 is 2 = (1+3)/2
        //second specialized method
        IntFunction<IntUnaryOperator> curriedAvg = a->b->(a+b)/2;
        IntUnaryOperator avg3 = curriedAvg.apply(3);
        int n3 = avg3.applyAsInt(3);
        System.out.println(n3);;
    }
    */
}
