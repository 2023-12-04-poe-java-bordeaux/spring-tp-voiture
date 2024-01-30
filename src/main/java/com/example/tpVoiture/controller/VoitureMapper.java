package com.example.tpVoiture.controller;

import com.example.tpVoiture.model.Voiture;

public class VoitureMapper {

    public static VoitureDTO convertToDto(Voiture voiture){
        VoitureDTO dto = new VoitureDTO();
        dto.setBrand(voiture.getMarque());
        dto.setModel(voiture.getModele());
        dto.setYear(voiture.getAnnee());
        dto.setColor(voiture.getCouleur());
        return dto;
    }
}
