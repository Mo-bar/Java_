package POO.Relationships;

public class Department {
    private int deptNo;
    private String  deptName;

    public int getDeptNo() {
        return deptNo;
    }
    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public Department(int deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "{" +
            " deptNo='" + getDeptNo() + "'" +
            ", deptName='" + getDeptName() + "'" +
            "}";
    }
    
}
