package com.epi.cabinetsmedicaux.services;

import com.epi.cabinetsmedicaux.model.Medcin;
import com.epi.cabinetsmedicaux.model.User;
import com.epi.cabinetsmedicaux.repository.MedcinRepository;
import com.epi.cabinetsmedicaux.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MedcinService{

    private final MedcinRepository medcinRepository;

    public MedcinService(MedcinRepository medcinRepository) {
        this.medcinRepository = medcinRepository;
    }


    public List<Medcin> getAllMedcins() {
        return (List<Medcin>) medcinRepository.findAll();
    }

    public Optional<Medcin> getMedcinById(Long id) {
        return medcinRepository.findById(id);
    }

    public Medcin saveMedcin(Medcin medcin) {
        return medcinRepository.save(medcin);
    }

    public void deleteMedcin(Long id) {
        medcinRepository.deleteById(id);
    }


    public Medcin findMedcinByEmail(String email) {
        return (Medcin) medcinRepository.findByEmail(email);
    }








}


