package io.github.ibtehajraza.springpetclinic20.service;

import io.github.ibtehajraza.springpetclinic20.model.Vet;

public interface VetService extends CrudService<Vet, Long> {
    Vet findByLastName(String lastName);

}
