package lambda;
//lambda cannot modify captured variables

import java.util.function.Consumer;

public class LambdaDemo_3 {
    public static void main(String[] args) {
        int[] x = {5};
        int z = 3;
        Consumer<Integer> addYtoX = y->{x[0]+=y;};
        addYtoX.accept(z);
        System.out.println(x[0]);

    }
}
