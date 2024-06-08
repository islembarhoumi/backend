package com.epi.cabinetsmedicaux.services;

import com.epi.cabinetsmedicaux.model.Inscription;
import com.epi.cabinetsmedicaux.model.Medcin;
import com.epi.cabinetsmedicaux.model.Patient;
import com.epi.cabinetsmedicaux.model.Secretaire;
import com.epi.cabinetsmedicaux.repository.MedcinRepository;
import com.epi.cabinetsmedicaux.repository.PatientRepository;
import com.epi.cabinetsmedicaux.repository.SecretaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {

    @Autowired
    private MedcinRepository medcinRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private SecretaireRepository secretaireRepository;

    // Constructeur pour l'injection des dépendances
    @Autowired
    public InscriptionService(MedcinRepository medcinRepository, PatientRepository patientRepository, SecretaireRepository secretaireRepository) {
        this.medcinRepository = medcinRepository;
        this.patientRepository = patientRepository;
        this.secretaireRepository = secretaireRepository;
    }

    public void inscrireUtilisateur(Inscription inscription) {
        if ("medecin".equalsIgnoreCase(inscription.getRole())) {
            inscrireMedcin(inscription);
        } else if ("patient".equalsIgnoreCase(inscription.getRole())) {
            inscrirePatient(inscription);
        } else if ("secretaire".equalsIgnoreCase(inscription.getRole())) {
            inscrireSecretaire(inscription);
        } else {
            throw new IllegalArgumentException("Rôle non valide pour l'inscription.");
        }
    }

    private void inscrirePatient(Inscription inscription) {
        Patient patient = new Patient(inscription.getNom(), inscription.getPrenom(),
                inscription.getEmail(),
                inscription.getAdresse(), inscription.getTelephone(),  inscription.getPassword(),
                inscription.getMaladie(), inscription.getAllergie());

        patientRepository.save(patient);
    }

    private void inscrireMedcin(Inscription inscription) {
        Medcin medcin = new Medcin(inscription.getNom(), inscription.getPrenom(),
                inscription.getEmail(), inscription.getPassword(),
                inscription.getAdresse(), inscription.getTelephone(),
                inscription.getSpecialite(), inscription.getExperience());

        medcinRepository.save(medcin);
    }
    private void inscrireSecretaire(Inscription inscription) {
        Secretaire secretaire = new Secretaire(inscription.getNom(), inscription.getPrenom(),
                inscription.getEmail(), inscription.getPassword(),
                inscription.getAdresse(), inscription.getTelephone(),
                inscription.getAnneeExperience());

        secretaireRepository.save(secretaire);
    }

}
