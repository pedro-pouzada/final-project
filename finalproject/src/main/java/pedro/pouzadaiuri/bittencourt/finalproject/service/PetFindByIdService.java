package pedro.pouzadaiuri.bittencourt.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.PetEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.PetRepository;

@Service
public class PetFindByIdService {

    @Autowired
    private PetRepository petRepository;

    public PetEntity findById(long id) {
        return this.petRepository.findById(id).get();
    }

}

