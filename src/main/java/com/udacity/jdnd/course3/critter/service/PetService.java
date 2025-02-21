package com.udacity.jdnd.course3.critter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udacity.jdnd.course3.critter.entities.Customer;
import com.udacity.jdnd.course3.critter.entities.Pet;
import com.udacity.jdnd.course3.critter.repositories.CustomerRepository;
import com.udacity.jdnd.course3.critter.repositories.PetRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PetService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PetRepository petRepository;

    public Pet getPetById(Long petId) {
        Pet pet = petRepository.getOne(petId);
        return pet;
    }

    public List<Pet> getAllPets() {
        List<Pet> pets = petRepository.findAll();
        return pets;
    }

    public Pet savePet(Pet pet, Long customerId) {
        Customer customer = customerRepository.getOne(customerId);
        pet.setCustomer(customer);
        pet = petRepository.save(pet);

        List<Pet> pets = new ArrayList<>();
        pets.add(pet);
        customer.setPets(pets);
        
        customerRepository.save(customer);

        return pet;
    }

    public List<Pet> getPetsByCustomerId(long customerId) {
        List<Pet> pets = petRepository.findByCustomerId(customerId);
        return pets;
    }


}