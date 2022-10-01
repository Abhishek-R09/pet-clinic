package dev.abhishekr.petclinic.services;

import java.util.Set;

import dev.abhishekr.petclinic.model.Vet;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
