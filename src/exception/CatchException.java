package exception;
class IsNullException extends RuntimeException{}
class IsEmptyException extends RuntimeException{}

public class CatchException {
    static void throwWhenNullOrEmpty(int[] array)
    {
        if(array == null){
            throw new IsNullException();
        }
        if (array.length==0) {
            throw new IsEmptyException();
        }
    }
    public static void main(String[] args) {
        try {
            int[] array = new int[]{};
            throwWhenNullOrEmpty(array);
        } catch (IsNullException e) {
            e.printStackTrace();
        }catch (IsEmptyException e){
            e.printStackTrace();
        }

    }
}
