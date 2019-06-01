package patterns.Creational;
//abstract factory
interface IFactory{
    IProductA createA();
    IProductB createB();
}

//concrete factory
class Factory1 implements IFactory{
    public IProductA createA(){
        return new ProductA1();
    }
    public IProductB createB(){
        return new ProductB1();
    }
}

//concrete factory_2
class Factory2 implements IFactory{
    public IProductA createA(){
        return new ProductA2();
    }
    public IProductB createB(){
        return new ProductB2();
    }
}

//abstract product A
interface IProductA {
    void testA();
}
//abstract product B
interface IProductB{
    void testB();
}

//concrete product A1
class ProductA1 implements IProductA{
    public void testA(){
        System.out.println("test A1");
    }
}
//concrete product A2
class ProductA2 implements IProductA{
    public void testA(){
        System.out.println("test A2");
    }
}

//concrete product B1
class ProductB1 implements IProductB{
    public void testB(){
        System.out.println("test B1");
    }
}

class ProductB2 implements IProductB{
    public void testB(){
        System.out.println("test B2");
    }
}



public class AbstractFactory {
    //client code
     void testFactory(IFactory factory){
        IProductA productA = factory.createA();
        IProductB productB = factory.createB();
        productA.testA();
        productB.testB();
    }
    public static void main(String[] args) {
        new AbstractFactory().testFactory(new Factory1());
        new AbstractFactory().testFactory(new Factory2());
    }
}

