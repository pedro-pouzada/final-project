package pedro.pouzadaiuri.bittencourt.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.ClientEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.ClientRepository;

@Service
public class ClientSaveService {

    @Autowired
    private ClientRepository clientRepository;


    public ClientEntity save(ClientEntity clientEntity) {
        return this.clientRepository.save(clientEntity);
    }

}
