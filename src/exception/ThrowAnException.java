package exception;
class Car{}
class Seller{
    Car[] cars = new Car[]{};
    public void sell(){
        if(cars.length == 0 ){
            throw new RuntimeException("No cars for sale");
        }
        //Some implementation...
    }
}
public class ThrowAnException {
    public static void main(String[] args) {
        Seller seller = new Seller();
        try {
            seller.sell();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
