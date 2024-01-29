package com.example.tpVoiture;

import com.example.tpVoiture.dao.VoitureRepository;
import com.example.tpVoiture.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoitureService {

    @Autowired
    VoitureRepository voitureRepository;

   public void add(Voiture voiture){
       voitureRepository.save(voiture);
   }

   public List<Voiture> findAll(){
       return voitureRepository.findAll();
   }

   public Optional<Voiture> findById(Integer id){
       return voitureRepository.findById(id);
   }

   public void delete(Integer id){
       voitureRepository.deleteById(id);
   }

   public void update(Voiture voiture){
       voitureRepository.save(voiture);
   }
}
