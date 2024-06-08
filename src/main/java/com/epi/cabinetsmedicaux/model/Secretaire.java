package com.epi.cabinetsmedicaux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@AllArgsConstructor
public class Secretaire  extends User {


    private int anneeExperience;

    @ManyToOne
    @JoinColumn(name ="cabinet_id")
    private Cabinet cabinet;





    public Secretaire(String nom, String prenom, String email, String adresse, String telephone,  String password , int anneeExperience) {

        super(nom, prenom, email, adresse, telephone,  password);
        this.anneeExperience = anneeExperience;
    }


    public Secretaire() {

    }



}







