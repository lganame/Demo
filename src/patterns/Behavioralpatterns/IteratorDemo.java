package patterns.Behavioralpatterns;

import java.util.Iterator;

//Iteraotr
interface IntInterator{
    void first();
    void next();
    boolean isDone();
    int currentItem();
}
//Aggregate
interface IntAggregate{
    IntInterator getIterator();
}

//ConcreateAggregate
class PrimeNumbers implements IntAggregate{
    private int[] numbers = {2,3,5,7,11};
    public IntInterator getIterator(){
        return new Iterator();
    }
    //ConcreteIterator
    class Iterator implements IntInterator{
        private int index;
        public void first(){
            index = 0;
        }
        public void next(){
            index ++;
        }
        public boolean isDone(){
            return index >= numbers.length;
        }
        public int currentItem(){
            return numbers[index];
        }
    }
}
public class IteratorDemo {
    public static void main(String[] args) {
        PrimeNumbers numbers = new PrimeNumbers();
        IntInterator iterator = numbers.getIterator();
        int sum = 0;
        for(iterator.first();iterator.isDone();iterator.next()){
            sum += iterator.currentItem();
        }
    }
}
