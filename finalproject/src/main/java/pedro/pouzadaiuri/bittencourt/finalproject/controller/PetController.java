package pedro.pouzadaiuri.bittencourt.finalproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedro.pouzadaiuri.bittencourt.finalproject.model.PetEntity;
import pedro.pouzadaiuri.bittencourt.finalproject.service.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Pedro Pouzada
 * @author Iuri Bittencourt
 * @version 1.0
 * @since 25/06/2020 - 17:10
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/pets")
public class PetController {


    @Autowired
    private PetFindAllService petFindAllService;

    @Autowired
    private PetFindByIdService petFindByIdService;

    @Autowired
    private PetSaveService petSaveService;

    @Autowired
    private PetUpdateService petUpdateService;


    @Autowired
    private PetDeleteService petDeleteService;

        @GetMapping
        public ResponseEntity<List<PetEntity>> findAll() {
            return new ResponseEntity<List<PetEntity>>(this.petFindAllService.findAll(),new HttpHeaders(), HttpStatus.OK);
    }

     @GetMapping(path = "/{id}")
        public ResponseEntity<PetEntity> findById(@PathVariable("id") long id){


            PetEntity petEntity = this.petFindByIdService.findById(id);
            if(petEntity != null){
            return new ResponseEntity<PetEntity>(petEntity,new HttpHeaders(), HttpStatus.OK);
        }
            return new ResponseEntity<PetEntity>(HttpStatus.NOT_FOUND);
    }

        @PostMapping
        public ResponseEntity<PetEntity> save(@RequestBody PetEntity petEntity) {
            System.out.println(petEntity.toString());
            return new ResponseEntity<PetEntity>(this.petSaveService.save(petEntity), new HttpHeaders(), HttpStatus.CREATED);

    }

        @PutMapping
        public ResponseEntity<PetEntity> update(@RequestBody PetEntity petEntity) {

            return new ResponseEntity<PetEntity>(this.petUpdateService.update(petEntity), new HttpHeaders(), HttpStatus.OK);
    }

        @DeleteMapping(path = "/{id}")
        public ResponseEntity<PetEntity> delete(@PathVariable("id") long id) {
            this.petDeleteService.delete(id);
            return new ResponseEntity<PetEntity>(new HttpHeaders(), HttpStatus.OK);
     }
   }

