package POO.Relationships;

public class Employee_ {

    private int id;
    private float salary;
    private PersonnalInformation personalInfo; // ? composition relationship
    private Department dept; // ? Aggregation relationship

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public PersonnalInformation getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonnalInformation personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Employee_(int id, float salary, PersonnalInformation personalInfo, Department dept) {
            this.id = id;
            this.salary = salary;
            this.personalInfo = personalInfo;
            this.dept = dept;
        }

    public Employee_(int id, float salary,String fName, String lName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, Department dept) {
            this.id = id;
            this.salary = salary;
            this.personalInfo = new PersonnalInformation(fName, lName,bloodGroup, accountNumber, nationality, yearOfBirth); // composition relationship.
            this.dept = dept;
        }

    @Override
    public String toString() {
        return "\n{" +
                " id='" + getId() + "'" +
                ", salary='" + getSalary() + "'" +
                ", personalInfo='" + getPersonalInfo() + "'" +
                ", dept='" + getDept() + "'" +
                "}";
    }

}
