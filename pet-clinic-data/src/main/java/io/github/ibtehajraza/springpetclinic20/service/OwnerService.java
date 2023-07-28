package io.github.ibtehajraza.springpetclinic20.service;

import io.github.ibtehajraza.springpetclinic20.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
