package models;

public class Employee extends Person{
    protected String employeeCode;
    protected double monthlySalary;
    protected String academicLevel;
    protected String yourPosition;

    public Employee() {
    }

    public Employee(String employeeCode, double monthlySalary, String academicLevel, String yourPosition) {
        this.employeeCode = employeeCode;
        this.monthlySalary = monthlySalary;
        this.academicLevel = academicLevel;
        this.yourPosition = yourPosition;
    }

    public Employee(String fullName, int dateOfBirth, int phoneNumber, String numId, String sex, String eMail, String employeeCode, double monthlySalary, String academicLevel, String yourPosition) {
        super(fullName, dateOfBirth, phoneNumber, numId, sex, eMail);
        this.employeeCode = employeeCode;
        this.monthlySalary = monthlySalary;
        this.academicLevel = academicLevel;
        this.yourPosition = yourPosition;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getYourPosition() {
        return yourPosition;
    }

    public void setYourPosition(String yourPosition) {
        this.yourPosition = yourPosition;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", academicLevel='" + academicLevel + '\'' +
                ", yourPosition='" + yourPosition + '\'' +
                '}';
    }


}
