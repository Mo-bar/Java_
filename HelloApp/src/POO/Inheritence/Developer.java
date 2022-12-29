package POO.Inheritence;

public class Developer extends Employee { //? sub-class child-class derived-class extended-class.

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    Developer(String name, String email, String phone, String department, int yearOfBirth, double salary,String groupName){
        super(name, email, phone, department, yearOfBirth, salary);
        this.groupName = groupName;
    }
}
