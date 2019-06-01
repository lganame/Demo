package exception;



class IsNullException_2 extends RuntimeException{}
class IsEmptyException_2 extends RuntimeException{}

public class CatchAllException {
    static void throwWhenNullOrEmpty(int[] array)
    {
        if (array == null) {
            throw new IsNullException_2();
        }
        if (array.length == 0){
            throw new IsEmptyException_2();
        }
    }
    public static void main(String[] args) {
        try {
           new CatchAllException().throwWhenNullOrEmpty(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
