package guru.springframework.petcliniccustomapp.service;

import guru.springframework.petcliniccustomapp.model.Owner;
import guru.springframework.petcliniccustomapp.model.Pet;

import java.util.Set;

public interface PetService extends CrudService<Pet, Long>{
    // Here all the services are defined by crudService
    // Since we are extending CrudService we can have those methods in this interface also
}
