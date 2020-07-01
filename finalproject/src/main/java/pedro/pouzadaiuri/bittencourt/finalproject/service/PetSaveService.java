package pedro.pouzadaiuri.bittencourt.finalproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.PetEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.PetRepository;

@Service
public class PetSaveService {

    @Autowired
    private PetRepository petRepository;

    public PetEntity save(PetEntity petEntity) {
        return this.petRepository.save(petEntity);
    }
}
