package io.github.ibtehajraza.springpetclinic20.service;

import io.github.ibtehajraza.springpetclinic20.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> finaALl();
}
