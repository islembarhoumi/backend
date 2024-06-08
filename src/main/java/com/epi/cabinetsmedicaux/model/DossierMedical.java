package com.epi.cabinetsmedicaux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@AllArgsConstructor
public class DossierMedical {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String diagnostics;
    private  String  symptomes;
    private  String ordonnances;

    @OneToMany(mappedBy ="dossierMedical", cascade = CascadeType.ALL)
    private List<Medcin> medcins;




    public DossierMedical() {
        // Constructeur par défaut
    }




}



