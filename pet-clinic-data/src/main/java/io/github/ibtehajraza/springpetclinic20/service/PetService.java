package io.github.ibtehajraza.springpetclinic20.service;

import io.github.ibtehajraza.springpetclinic20.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

    Pet findByLastName(String lastName);

}
