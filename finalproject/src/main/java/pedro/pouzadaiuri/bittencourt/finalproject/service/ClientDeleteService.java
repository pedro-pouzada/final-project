package pedro.pouzadaiuri.bittencourt.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.ClientRepository;

@Service
public class ClientDeleteService {

    @Autowired
    private ClientRepository clientRepository;

    public void delete(long id) {
        this.clientRepository.deleteById(id);
    }
}
