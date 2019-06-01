package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaSix {
    public static void main(String[] args) {
        // 不使用lambda表达式为每个订单加上12%的税
        List costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Object cost : costBeforeTax) {
            //double price = cost + .12*Double.valueOf( (Integer)cost);
            //System.out.println(price);
        }

// 使用lambda表达式
        //List costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        //costBeforeTax.stream().map((cost) -> cost + .12*Integer.valueOf(cost).forEach(System.out::println));
    }
}
