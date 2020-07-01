package pedro.pouzadaiuri.bittencourt.finalproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.PetEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.PetRepository;

@Service
public class PetUpdateService {

    @Autowired
    private PetRepository petRepository;

    public PetEntity update(PetEntity petEntity) {
        return this.petRepository.save(petEntity);
    }
}
