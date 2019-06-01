package exception;

public class RethrowException {
    void methodWithException() throws Exception{
        try {
            throw new Exception("test exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            new RethrowException().methodWithException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
