package pedro.pouzadaiuri.bittencourt.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.ClientEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.ClientRepository;

import java.util.List;

@Service
public class ClientFindAllService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> findAll() {
        return (List<ClientEntity>)this.clientRepository.findAll();
    }

}
