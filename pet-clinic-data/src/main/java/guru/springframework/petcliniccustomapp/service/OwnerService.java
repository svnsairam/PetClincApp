package guru.springframework.petcliniccustomapp.service;

import guru.springframework.petcliniccustomapp.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Owner findByLastName(String lastName);

    Set<Owner> findAll();
}
