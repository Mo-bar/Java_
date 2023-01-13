package POO.Abstraction.AbstractClass;

public class Sedan extends Car{
    @Override
    public void autoPilot() {
        System.out.println("Sedan auto-Pilot.");
    }

    @Override
    public void parkingSensors() {
        System.out.println("Sedan parking sensors.");
    }

    @Override
    public void streamingServices() {
        System.out.println("Sedan streaming services.");
    }
}
