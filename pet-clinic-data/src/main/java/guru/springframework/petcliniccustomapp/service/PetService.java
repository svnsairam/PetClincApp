package guru.springframework.petcliniccustomapp.service;

import guru.springframework.petcliniccustomapp.model.Owner;
import guru.springframework.petcliniccustomapp.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
