package com.cts.employeeoperation.config;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cts.employeeoperation.model.Employee;

@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Modifying
    @Query("UPDATE Employee SET salary= :salary WHERE id = :employeeId")
    int updateSalary(@Param("employeeId") long employeeId, @Param("salary") long salary);
}