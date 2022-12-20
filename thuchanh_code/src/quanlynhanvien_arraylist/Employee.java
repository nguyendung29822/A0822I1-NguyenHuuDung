package quanlynhanvien_arraylist;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String fullName;
    private String employeeCode;
    private String myId;
    private String birthDay;
    private String position;
    private int numberPhone;

    public Employee(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Employee(String fullName, String employeeCode, String myId, String birthDay, String position, int numberPhone) {
        this.fullName = fullName;
        this.employeeCode = employeeCode;
        this.myId = myId;
        this.birthDay = birthDay;
        this.position = position;
        this.numberPhone = numberPhone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName='" + fullName + '\'' + ", employeeCode='" + employeeCode + '\'' + ", myId='" + myId + '\'' + ", birthDay='" + birthDay + '\'' + ", position='" + position + '\'' + ", numberPhone=" + numberPhone + '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeCode.compareTo(o.employeeCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeCode, employee.employeeCode);
    }

}

