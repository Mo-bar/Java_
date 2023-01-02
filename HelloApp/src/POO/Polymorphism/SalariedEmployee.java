package POO.Polymorphism;

public class SalariedEmployee extends Employee{
    private float bouns;

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }
    public SalariedEmployee(){}
    public SalariedEmployee(String name, String address, String deprt, String email, double salary, float bouns) {
        super(name, address, deprt, email, salary);
        this.bouns = bouns;
    }
    public double getSalary(){
        return super.getSalary() + bouns;
    }
    
    @Override
    public void Print(){
        System.out.println("Salaried-Employee");
    }    
    static public void Print1(){
        System.out.println("Sub-class");
    }
    static public void main(String args[]){
        Employee Emp = new SalariedEmployee(); //? Method overriding (dynamic binding or late binding)
        Emp.Print(); //? we cannot override static methods
        Emp.Print1();
        SalariedEmployee Emp1 = new SalariedEmployee();
        Emp1.Print(); 
        Emp1.Print1();

        Employee[] ar = new Employee[] {new Employee(),
                                        new HourlyEmployee(),
                                        new DailyEmployee(),
                                        new SalariedEmployee() };
        for(Employee em : ar){
            em.Print();
        }
    }
}
