package services.impl;

import models.Employee;
import services.IEmploeeService;

import java.util.ArrayList;

public class EmployeeService implements IEmploeeService {
    private ArrayList<Employee> listEmployee;
    public EmployeeService(ArrayList<Employee> listEmployee){
        this.listEmployee = listEmployee;
    }

    public EmployeeService() {
        this.listEmployee = new ArrayList<>();
    }
    public void AddEmployee(Employee employee){
        this.listEmployee.add(employee);
    }
    public void EditEmployeeInformation(Employee employee){
        for (int i = 0; i < listEmployee.size(); i++) {
            if(listEmployee.get(i).getEmployeeCode().equals(employee.getEmployeeCode())){
                listEmployee.set(i,employee);
            }
        }
    }
    public boolean CheckEmployeeCode(String employeeCode){
        return this.listEmployee.contains(employeeCode);
    }

    public void DisplayListEmployee(){
        for (Employee employee: listEmployee) {
            System.out.println(employee);
        }
    }
}




//    int choose1 = scanner.nextInt();
//                    scanner.nextLine();
//                            if (choose1 == 1) {
//                            System.out.println("List Employee :");
//                            employee.DisplayListEmployee();
//                            } else if (choose1 == 2) {
//                            System.out.println("fullName :");
//                            String fullName = scanner.nextLine();
//                            System.out.println("dateOfBirth :");
//                            int dateOfBirth = scanner.nextInt();
//                            System.out.println("phoneNumber :");
//                            int phoneNumber = scanner.nextInt();
//                            System.out.println("numId :");
//                            String numId = scanner.nextLine();
//                            scanner.nextLine();
//                            System.out.println("sex :");
//                            String sex = scanner.nextLine();
//                            System.out.println("eMail :");
//                            String eMail = scanner.nextLine();
//                            System.out.println("employeeCode :");
//                            String employeeCode = scanner.nextLine();
//                            System.out.println("monthlySalary :");
//                            double monthlySalary = scanner.nextDouble();
//                            System.out.println("academicLevel :");
//                            String academicLevel = scanner.nextLine();
//                            System.out.println("yourPosition :");
//                            String yourPosition = scanner.nextLine();
//                            Employee employees = new Employee(fullName, dateOfBirth, phoneNumber, numId, sex, eMail, employeeCode, monthlySalary, academicLevel, yourPosition);
//                            employee.AddEmployee(employees);
//                            } else if (choose1 == 3) {
//                            System.out.println("employeeCode :");
//                            String employeeCode = scanner.nextLine();
//                            System.out.println("result :" + employee.CheckEmployeeCode(employeeCode));
//                            boolean result = employee.CheckEmployeeCode(employeeCode);
//                            if (result) {
//                            System.out.println("fullName :");
//                            String fullName = scanner.nextLine();
//                            System.out.println("dateOfBirth :");
//                            int dateOfBirth = scanner.nextInt();
//                            System.out.println("phoneNumber :");
//                            int phoneNumber = scanner.nextInt();
//                            System.out.println("numId :");
//                            String numId = scanner.nextLine();
//                            System.out.println("sex :");
//                            String sex = scanner.nextLine();
//                            System.out.println("eMail :");
//                            String eMail = scanner.nextLine();
//                            System.out.println("monthlySalary :");
//                            double monthlySalary = scanner.nextDouble();
//                            System.out.println("academicLevel :");
//                            String academicLevel = scanner.nextLine();
//                            System.out.println("yourPosition :");
//                            String yourPosition = scanner.nextLine();
//                            Employee employees = new Employee(fullName, dateOfBirth, phoneNumber, numId, sex, eMail, employeeCode, monthlySalary, academicLevel, yourPosition);
//                            employee.EditEmployeeInformation(employees);
//                            } else {
//                            break;
//                            }
//                            } else {
//                            break;
//
//                            }
