package POO.Relationships;

public class Main {
    
    public static void main(String args[]){
        Department dept = new Department(010, "IT");  // aggregation relationship
        Employee_ emp = new Employee_(123, 99999, "Ali", "Mo", "O+", "ssasa", "Moroccan", 2000, dept);
        System.out.println(emp);
    }
}
