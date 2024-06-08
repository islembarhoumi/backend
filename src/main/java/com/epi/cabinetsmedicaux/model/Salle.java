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

public class Salle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private int capacite ;
    private int numbrsalle ;

    @ManyToOne
    @JoinColumn(name ="cabinet_id")
    private Cabinet cabinet;



    public Salle() {

    }



}