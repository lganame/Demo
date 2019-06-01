package exception;

public class Guaranteed {
    void throwIfTrue(Boolean param){
        try {
            if (param) throw new RuntimeException("test exception");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) {

        new Guaranteed().throwIfTrue(true);
        new Guaranteed().throwIfTrue(false);
    }
}
