package lang;

public class Elapsed {
    public static void main(String[] args) {
        long start,end;
        System.out.println("Timing a for loop from 0 to 100000000");
        //time a for loop from 0 to 100000000
        start = System.currentTimeMillis();
        for(long i=0;i<100000000L;i++);
        end = System.currentTimeMillis();
        System.out.println("Elapsed time: "+(end-start));
        start = System.nanoTime();
        for(long i=0;i<1000000000L;i++);
        end = System.nanoTime();
        System.out.println("Elapsed time: "+(end-start));
    }
}
