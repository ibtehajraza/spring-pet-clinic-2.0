package io.github.ibtehajraza.springpetclinic20.map;

import io.github.ibtehajraza.springpetclinic20.model.Pet;
import io.github.ibtehajraza.springpetclinic20.service.CrudService;

import java.util.Set;

public class petServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
