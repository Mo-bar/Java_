package POO.Abstraction.GenericInterface;
import POO.Abstraction.Interface.Car_V1;

public class Object_ <T> implements GenericInter <T> {

    @Override
    public T genericFun(){
        return (T) new Car_V1();
    }
}
