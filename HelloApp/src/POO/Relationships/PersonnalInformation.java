package POO.Relationships;

public class PersonnalInformation {
    private String fistName, lastName, bloodGroup, accountNumber, nationality;
    private int yearOfBirth;

    public String getFistName() {
        return this.fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodGroup() {
        return this.bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    
    public PersonnalInformation(String fName, String lName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth) {
        this.fistName = fName;
        this.lastName = lName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }
    
    @Override
    public String toString() {
        return "\n{" +
            " fistName='" + getFistName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", bloodGroup='" + getBloodGroup() + "'" +
            ", accountNumber='" + getAccountNumber() + "'" +
            ", nationality='" + getNationality() + "'" +
            ", yearOfBirth='" + getYearOfBirth() + "'" +
            "}";
    }

}
