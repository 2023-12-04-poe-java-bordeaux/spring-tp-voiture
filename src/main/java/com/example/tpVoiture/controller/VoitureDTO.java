package com.example.tpVoiture.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.time.Year;

public class VoitureDTO {

    private String brand;
    private String model;
    private int year;
    private String color;
    private int age;

    @JsonIgnore
    private LocalDate dateImmatriculation;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        //return Year.now().getValue() - getYear();
        return LocalDate.now().getYear() - dateImmatriculation.getYear();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateImmatriculation() {
        return dateImmatriculation;
    }

    public void setDateImmatriculation(LocalDate dateImmatriculation) {
        this.dateImmatriculation = dateImmatriculation;
    }
}
