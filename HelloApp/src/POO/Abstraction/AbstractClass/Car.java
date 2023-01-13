package POO.Abstraction.AbstractClass;
/**
**  Abstraction : 
    Hiding the internal implementaion of the feature and only showing the functionality (services) to  the users.
**  Abstract class :
    allows us to create a blueprint for concrete classes.
**  Concrete class : 
    A concrete class is a class that can be used to create an object. An abstract class cannot be used to create an object 

**  Rules for abstract class : 
    - An abstract class must be declared with an abstract keywird.
    - It can have abstract and non-abstract methods.
    - It cannot be inistantiated.
    - It can have final methods.
    - It can have constractors and static methods also.
    
*/

 abstract public class Car {
    private float height, weight;
    private String brand;
    private int registrationNumber;

    public Car(){};
    public Car(float height, float weight, String brand, int registrationNumber) {
        this.height = height;
        this.weight = weight;
        this.brand = brand;
        this.registrationNumber = registrationNumber;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    abstract public void autoPilot();
    abstract public void streamingServices(); 
    abstract public void parkingSensors();

}
