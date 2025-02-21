package com.udacity.jdnd.course3.critter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udacity.jdnd.course3.critter.entities.Employee;
import com.udacity.jdnd.course3.critter.entities.Pet;
import com.udacity.jdnd.course3.critter.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> getSchedulesByPets(Pet pet);

    List<Schedule> getSchedulesByEmployees(Employee employee);

    List<Schedule> getSchedulesByPetsIn(List<Pet> pets);
}