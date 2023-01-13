package POO.Abstraction.Interface;
/**
 ** Benefits of Interfaces : 
 *  - To achieve security; hide centain details and only show the omportant of an object (interface).
 * 
 *  - Java does not support multiple-inheritance (a class inherits multiple super-class), 
 *    Howevwe can acheive that with interfaces cause a class implement multiple interfaces.
 * 
 *  - An interface can extends an interface or more.
 */
public class Main {
    static void polyFun(SelfDrivable obj ){ //** Reusibility concept : polymorfism.
        obj.drive();
    }
    public static void main(String args[]){
        SelfDrivable car = new Car_V1();
        car.drive();  //todo : only common methods between super-class and sub-class  that we can use 
        car = new Car_V2();
        car.drive();

        //? Another method.
        polyFun(new Car_V1());
        polyFun(new Car_V2());

    }
}
