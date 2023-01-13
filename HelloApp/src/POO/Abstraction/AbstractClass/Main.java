package POO.Abstraction.AbstractClass;

public class Main {

    static void fun(Car car){
        car.autoPilot();
    }
    public static void main(String args[]){
        Car car = new SUV();
        fun(car);
        car = new Hachback();
        fun(car);
        car = new Sedan();
        fun(car);

    }
}
