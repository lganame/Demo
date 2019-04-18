package lang;

public class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        clObj = x.getClass();
        System.out.println("x is object of type:" +clObj.getName());
        clObj = y.getClass();
        System.out.println("y is Object of type:"+clObj.getName());
    }
}
