package io.github.ibtehajraza.springpetclinic20.service;


import io.github.ibtehajraza.springpetclinic20.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> finaALl();
}
