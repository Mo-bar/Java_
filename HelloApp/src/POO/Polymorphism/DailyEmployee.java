package POO.Polymorphism;

public class DailyEmployee extends Employee {

    private float dayPrice;
    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public float getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(float dayPrice) {
        this.dayPrice = dayPrice;
    }
    DailyEmployee(){}
    public DailyEmployee(String name, String address, String deprt, String email, float dayPrice, int days) {
        super(name, address, deprt, email);
        this.dayPrice = dayPrice;
        this.days = days;
    }
    public double getSalary(){
        return dayPrice* days;
    }
    @Override
    public void Print(){
        System.out.println("Daily-Employee");
    }
}
