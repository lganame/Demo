package multipleThread_BXD;
class Test extends Thread
{
    private String name;
    Test(String name)
    {
        this.name = name;
    }
    public void run()
    {
        for(int i=0;i<60;i++) {
            //System.out.println(name+" run "+i);
            System.out.println(this.getName()+" run "+i);
            System.out.println((Thread.currentThread()==this)+"...."+this.getName()+" run "+i);
        }
    }
}

public class ThreadDemo_2 {
    public static void main(String[] args) {
        Test test1 = new Test("one");
        Test test2 = new Test("two");
        test1.start();
        test2.start();
        for(int x=0;x<60;x++) System.out.println("Hello world "+x);
    }
}
