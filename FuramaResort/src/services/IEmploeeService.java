package services;

import models.Employee;

public interface IEmploeeService {
    void DisplayListEmployee();

    void AddEmployee(Employee employee);

    void EditEmployeeInformation(Employee employee);

    boolean CheckEmployeeCode(String employeeCode);

}
