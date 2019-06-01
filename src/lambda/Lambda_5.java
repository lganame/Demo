package lambda;
import java.util.Arrays;

public class Lambda_5 {
    public static void main(String[] args) {
        Integer[] numbers = {1,3,2};
        Arrays.sort(numbers,(a,b)->Integer.compare(b,a));
        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i]+",");
        }

        //int[] numbers2 = {1,3,2};
        //Arrays.sort(numbers2,(a,b)->Integer.compare(b,a));
    }
}
