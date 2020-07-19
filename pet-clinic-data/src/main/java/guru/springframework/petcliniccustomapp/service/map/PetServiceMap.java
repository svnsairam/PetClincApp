package guru.springframework.petcliniccustomapp.service.map;

import guru.springframework.petcliniccustomapp.model.Owner;
import guru.springframework.petcliniccustomapp.model.Pet;
import guru.springframework.petcliniccustomapp.service.CrudService;

import java.util.Set;

public class PetServiceMap  extends AbstractMapService<Pet, Long> implements CrudService<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
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
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
