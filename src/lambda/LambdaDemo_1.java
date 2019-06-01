package lambda;

import java.util.function.Function;

/**
 * 有一个参数
 */
public class LambdaDemo_1 {
    public static void main(String[] args) {
        //explicitly specify return type
        Function<Integer,Integer> powOfTwo = (Integer power) -> (int)Math.pow(2,power);
        int pow8 = powOfTwo.apply(8);
        System.out.println(pow8);

        //implicity specify return type
        Function<Double,Double> powOfThree = power -> Math.pow(3,power);
        double pow3 = powOfThree.apply(3.0);
        System.out.println(pow3);


    }
}
