package tech.calas.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.calas.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
