package multiplethread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitTest {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void waitHere(long waitTime) {
        System.out.println("wait started...");
        lock.lock();
        try {
            condition.await(waitTime, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        lock.unlock();
        System.out.println("wait ends here...");
    }

    public static void main(String[] args) {
        //Your Code
        new WaitTest().waitHere(10);
        //Your Code
    }

}
