package POO.Inheritence;

public class Project extends Developer {

    private String projectName;
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    Project(String name, String email, String phone, String department, int yearOfBirth, double salary,String groupName, String projectName) {
        super(name, email, phone, department, yearOfBirth, salary, groupName);
        this.projectName = projectName;
    }

    
}
