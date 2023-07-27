package io.github.ibtehajraza.springpetclinic20.service;

import io.github.ibtehajraza.springpetclinic20.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> finaALl();
}
