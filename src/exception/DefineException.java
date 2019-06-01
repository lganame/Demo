package exception;
class SimpleException extends Exception{

}
class RecommendExc extends RuntimeException{
    //recommended constructors
    public RecommendExc(){}
    public RecommendExc(String message){
        super(message);
    }
}
public class DefineException {
    public static void main(String[] args) {
        //new DefineException().throw new SimpleException();
        //new DefineException().throw new RecommendExc("exception");
    }
}
