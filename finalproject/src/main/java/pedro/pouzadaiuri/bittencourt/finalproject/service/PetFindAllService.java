package pedro.pouzadaiuri.bittencourt.finalproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedro.pouzadaiuri.bittencourt.finalproject.model.PetEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.repositories.PetRepository;

import java.util.List;

@Service
public class PetFindAllService {

    @Autowired
    private PetRepository petRepository;

    public List<PetEntity> findAll() {
        return (List<PetEntity>)this.petRepository.findAll();
    }
}
