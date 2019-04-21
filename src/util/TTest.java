package util;

import java.util.Timer;

public class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer= new Timer();
        /*Set an initial delay of 1 second,
        then repeat every half second*/
        myTimer.schedule(myTask,1000,500);
         try{
             Thread.sleep(5000);
         }catch(InterruptedException exc){
             myTimer.cancel();
         }
    }
}
