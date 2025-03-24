package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import models.*;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

}
