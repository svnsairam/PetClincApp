package guru.springframework.petcliniccustomapp.service;

import guru.springframework.petcliniccustomapp.model.Owner;
import guru.springframework.petcliniccustomapp.model.Pet;
import guru.springframework.petcliniccustomapp.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
