package com.udacity.jdnd.course3.critter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udacity.jdnd.course3.critter.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}