package pedro.pouzadaiuri.bittencourt.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.PetRepository;


@Service
public class PetDeleteService {
    @Autowired
    private PetRepository petRepository;

    public void delete(long id) {
        this.petRepository.deleteById(id);
    }

}
