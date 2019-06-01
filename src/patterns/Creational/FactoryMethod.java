package patterns.Creational;
//product
class Employee{
    void test(){
        System.out.println("Employee");
    }
}
//ConcreteProduct
class Manager extends Employee{
    void test(){
        System.out.println("Manager");
    }
}

//Creator
class Creator{
    //FactoryMethod
    Employee createEmployee(){
        return new Employee();
    }
    //show operation
    void test(){
        createEmployee().test();
    }
}

//Manager
class ManagerCreator extends Creator{
    //FactoryMethod
    Manager createEmployee(){
        return new Manager();
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        //Client
        Creator creator = new Creator();
        creator.test();

        creator = new ManagerCreator();
        creator.test();
    }
}
