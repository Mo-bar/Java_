package POO.Inheritence;

/**
 * todo: Types of inheritence: 
 *  - single inheritence (class B -> class A)
 *  - Multilevel inheritence (class C -> class B -> class A)
 *  - Hierarchival inheritence (class B -> class A) && (class B -> class C)
 *  - Multiple inheritence (class C -> class A) && (class C -> class B) not supported in java, but java developers can use multiple interfaces 
 */
public class Employee { //? super class || parent class || base class || general class
    private String name;
    private String email;
    private String phone;
    private String department;
    private int yearOfBirth;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(String name, String email, String phone, String department, int yearOfBirth, double salary){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.salary = salary;
    }


    
}
