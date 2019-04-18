package lang;

public class TestClone implements Cloneable{
    int a;
    double b;
    //This method calls Object's clone()
    TestClone cloneTest(){
        try{
            //call clone in object
            return (TestClone) super.clone();

        }catch (CloneNotSupportedException e){
            System.out.println("Cloning not allowed.");
            return this;
        }
    }
}
