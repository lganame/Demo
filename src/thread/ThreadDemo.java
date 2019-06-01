package thread;

public class ThreadDemo implements Runnable{
    Thread t;
    public void run(){


        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ThreadDemo());
        // this will call run() function
        t.start();

        Thread t2 = new Thread(new ThreadDemo());
        // this will call run() function
        t2.start();
    }
}
