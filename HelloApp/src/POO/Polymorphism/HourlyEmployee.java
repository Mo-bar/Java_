package POO.Polymorphism;

public class HourlyEmployee extends Employee {
    
    private float hourPrice;
    private float hoursNumber;

    public float getHoursNumber() {
        return hoursNumber;
    }

    public void setHoursNumber(float hoursNumber) {
        this.hoursNumber = hoursNumber;
    }

    public float getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(float hourPrice) {
        this.hourPrice = hourPrice;
    }

    HourlyEmployee(){};
    public HourlyEmployee(String name, String address, String deprt, String email) {
        super(name, address, deprt, email);
    }

    public double getSalary(){
        return hourPrice* hoursNumber;
    }
    
    @Override
    public void Print(){
        System.out.println("Hourly-Employee");
    }
}
