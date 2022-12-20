package quanlynhanvien_arraylist;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        this.employees = new ArrayList<Employee>();
    }

    public EmployeeList(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee nv) {
        this.employees.add(nv);
    }

    public boolean deleteEmployee(Employee nv) {
        return this.employees.remove(nv);
    }

    public void deleteAll() {
        //this.employees.clear();
        this.employees.removeAll(employees);
    }

    public boolean checkEmployeeCode(String code) {
        return this.employees.contains(code);
    }

    public void searchEmployee(String Name) {
        for (Employee employee : employees) {
            if (employee.getFullName().indexOf(Name) >= 0) {
                System.out.println(employee);
            }
        }
    }

    public void editInformation(Employee codeEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeCode().equals(codeEmployee.getEmployeeCode())) {
                employees.set(i, codeEmployee);
            }
        }
    }

    public boolean checkEmployee(Employee nv) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeCode().contains(nv.getEmployeeCode())) {
                return true;
            }
        }
        return false;

        //return this.employees.contains(nv);
    }

    public void displayList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public boolean checkExistList() {
        return this.employees.isEmpty();
    }


}
