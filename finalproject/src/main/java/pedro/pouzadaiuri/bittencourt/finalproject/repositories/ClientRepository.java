package pedro.pouzadaiuri.bittencourt.finalproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pedro.pouzadaiuri.bittencourt.finalproject.model.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository <ClientEntity, Long> {

}
