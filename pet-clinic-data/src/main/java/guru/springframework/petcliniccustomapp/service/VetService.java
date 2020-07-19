package guru.springframework.petcliniccustomapp.service;

import guru.springframework.petcliniccustomapp.model.Owner;
import guru.springframework.petcliniccustomapp.model.Pet;
import guru.springframework.petcliniccustomapp.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{
    // Here all the services are defined by crudService
    // Since we are extending CrudService we can have those methods in this interface also
}
