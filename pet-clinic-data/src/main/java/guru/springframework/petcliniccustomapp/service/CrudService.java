package guru.springframework.petcliniccustomapp.service;

import java.util.Set;

// Defining generic CrudService
// OwnerService , PetService , VetService and just provide type and id type and can use those methods.
// We are just trying to memic Spring CrudRepository<Type,ID>
public interface CrudService<Type, ID> {
    Set<Type> findAll();
    Type findById(ID id);
    Type save(Type object);
    void delete(Type object);
    void deleteById(Type object);
}
