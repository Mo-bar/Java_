package POO.Abstraction.AbstractClass;

public class SUV extends Car{

    @Override
    public void autoPilot() {
        System.out.println("SUV auto-Pilot.");
    }

    @Override
    public void parkingSensors() {
        System.out.println("SUV parking sensors.");
    }

    @Override
    public void streamingServices() {
        System.out.println("SUV streaming services.");
    }
}
