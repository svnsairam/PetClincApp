package guru.springframework.petcliniccustomapp.service;

import guru.springframework.petcliniccustomapp.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    // Here all the services are defined by crudService
    // Since we are extending CrudService we can have those methods in this interface also

    // this a custom method specific to Owner Service.
    Owner findByLastName(String lastName);
}
