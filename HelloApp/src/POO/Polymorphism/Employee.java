package POO.Polymorphism;

public class Employee {
    private String name, address, deprt, email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDeprt() {
        return deprt;
    }
    public void setDeprt(String deprt) {
        this.deprt = deprt;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    private double salary;
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Employee(){}
    public Employee(String name, String address, String deprt, String email, double salary) {
        this.name = name;
        this.address = address;
        this.deprt = deprt;
        this.email = email;
        this.salary = salary;
    }    
    public Employee(String name, String address, String deprt, String email) {
        this.name = name;
        this.address = address;
        this.deprt = deprt;
        this.email = email;
    }

    public void Print(){
        System.out.println("Employee");
    }
    static public void Print1(){
        System.out.println("Super-class");
    }
    static public void main(String args[]){
        Employee Emp = new Employee("Ahmed", "casa", "IT", "ahmed@gmail.com",80000);

        Emp = new SalariedEmployee("Ahmed", "casa", "IT", "ahmed@gmail.com",80000,120); 
        //? object type : switch object type of Emp from Employee to salariedEmployee; this method allows to access only the commun attributs ant methods between base-class and super-class.

    }
}
