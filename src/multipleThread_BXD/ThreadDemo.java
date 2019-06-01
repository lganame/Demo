package multipleThread_BXD;
class Demo extends Thread{
    public void run()
    {
        for(int i=0;i<60;i++) {
            System.out.println("Demo run "+i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
        for(int x=0;x<60;x++) System.out.println("Hello world "+x);
    }
}
