package tech.calas.employeemanager.service;

import tech.calas.employeemanager.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Employee findEmployeeById(Long id);
}
