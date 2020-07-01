package pedro.pouzadaiuri.bittencourt.finalproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pedro.pouzadaiuri.bittencourt.finalproject.model.PetEntity;

@Repository
public interface PetRepository extends CrudRepository <PetEntity, Long> {

}
