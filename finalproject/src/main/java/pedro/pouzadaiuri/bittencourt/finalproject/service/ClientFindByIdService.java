package pedro.pouzadaiuri.bittencourt.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.ClientEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.ClientRepository;

@Service
public class ClientFindByIdService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientEntity findById(long id) {
        return this.clientRepository.findById(id).get();
    }

}
