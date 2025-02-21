package com.udacity.jdnd.course3.critter.repositories;

import java.time.DayOfWeek;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udacity.jdnd.course3.critter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> getEmployeesByDaysAvailable(DayOfWeek dayOfWeek);
}
