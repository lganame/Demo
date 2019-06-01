package exception;

public class MethodWidthException {
    //only the method with the keyword throws can throw an exception
    void methodWithException() throws Exception {
        throw new Exception("test exception");
    }

    //any method can throw an RuntimeException(){
    void methodWithRuntimeException(){
        throw new RuntimeException("test exception");
    }

}
