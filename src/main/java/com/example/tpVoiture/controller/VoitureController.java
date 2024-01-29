package com.example.tpVoiture.controller;

import com.example.tpVoiture.VoitureService;
import com.example.tpVoiture.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class VoitureController {

    @Autowired
    VoitureService voitureService;

    @GetMapping("voitures")
    public List<Voiture> findAll(){
        return voitureService.findAll();
    }

    @PostMapping("voitures")
    public void add(@RequestBody Voiture voiture){
        voitureService.add(voiture);
    }

    @GetMapping("voitures/{id}")
    public ResponseEntity<Voiture> findById(@PathVariable("id") Integer voitureId){
        Optional<Voiture> opt = voitureService.findById(voitureId);
        if(opt.isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(opt.get());
    }

    @DeleteMapping("voitures/{id}")
    public void delete(@PathVariable("id") Integer id){
        voitureService.delete(id);
    }

    @PutMapping("voitures/{id}")
    public ResponseEntity put(@PathVariable("id") Integer id
                            , @RequestBody Voiture voiture){
        // ATTENTION à l'ordre pour éviter le NullpointerException
        //  if(!id.equals(voiture.getId())) {
        if(!voiture.getId().equals(id)) {
                return ResponseEntity.badRequest().build();
        } else {
            voitureService.update(voiture);
            return ResponseEntity.ok().build();
        }
    }

}
