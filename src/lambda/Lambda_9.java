package lambda;

import java.util.function.Consumer;

public class Lambda_9 {
    public static void main(String[] args) {
        Consumer<Integer> add2AndPrint = a -> System.out.println(a+2);
        add2AndPrint.accept(5);;

    }
}
