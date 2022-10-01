package dev.abhishekr.petclinic.services;

import java.util.Set;

import dev.abhishekr.petclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
