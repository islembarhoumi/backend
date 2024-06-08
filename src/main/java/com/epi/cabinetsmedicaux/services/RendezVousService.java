package com.epi.cabinetsmedicaux.services;


import com.epi.cabinetsmedicaux.model.RendezVous;
import com.epi.cabinetsmedicaux.repository.PatientRepository;
import com.epi.cabinetsmedicaux.repository.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RendezVousService {
    private final RendezVousRepository rendezVousRepository;

    public RendezVousService(RendezVousRepository RendezVousRepository) {
        this.rendezVousRepository = RendezVousRepository;
    }




    public List<RendezVous> getAllRendezVous() {
        return (List<RendezVous>) rendezVousRepository.findAll();
    }

    public Optional<RendezVous> getRendezVousById(Long id) {
        return rendezVousRepository.findById(id);
    }

    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    public void deleteRendezVous(Long id) {
        rendezVousRepository.deleteById(id);
    }}


