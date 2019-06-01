package lambda;

class box{

}
public class LambdaOne {
    public static void main(String[] args) {
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

    }
    public void canshu(){
   //     () -> {System.out.println("Hello Lambda Expressions");};
    }
}
