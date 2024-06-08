package com.epi.cabinetsmedicaux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
    public class Medcin extends User {

    private String specialite;

    private int experience;


    @OneToMany(mappedBy = "medcin", cascade = CascadeType.ALL)
    private List<Consultation> consultations;

    @ManyToOne
    @JoinColumn(name = "dossierMedical_id")
    private DossierMedical dossierMedical;


    @OneToOne
    @JoinColumn(name = "cabinet_id")
    private Cabinet cabinet;

    @ManyToMany
    @JoinTable(name = "medcin_patient",
            joinColumns = @JoinColumn(name = "medcin_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private Set<Patient> patients;


    public Medcin(String nom, String prenom, String email, String adresse, String telephone, String password, String specialite, int experience) {

        super(nom, prenom, email, adresse, telephone, password);
        this.specialite = specialite;
        this.experience = experience;

    }


    public Medcin() {

    }


}








