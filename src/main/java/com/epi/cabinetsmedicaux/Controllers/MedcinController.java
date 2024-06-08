package com.epi.cabinetsmedicaux.Controllers;

import com.epi.cabinetsmedicaux.model.DossierMedical;
import com.epi.cabinetsmedicaux.model.DossierMedical;
import com.epi.cabinetsmedicaux.model.Medcin;
import com.epi.cabinetsmedicaux.model.User;
import com.epi.cabinetsmedicaux.services.DossierMedicalService;
import com.epi.cabinetsmedicaux.services.MedcinService;
import com.epi.cabinetsmedicaux.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class MedcinController {

    private final MedcinService medcinService;

    public MedcinController(MedcinService medcinService) {
        this.medcinService = medcinService;
    }



    @GetMapping
    public List<Medcin> getAllMedcin() {
        return medcinService.getAllMedcins();
    }

    @GetMapping("/{id}")
    public Optional<Medcin> getMedcinById(@PathVariable Long id) {
        return medcinService.getMedcinById(id);
    }


    @PostMapping("/saveMedcin")
    public Medcin saveMedcin(@RequestBody Medcin medcin)
            {
        return medcinService.saveMedcin(medcin);
    }

    @DeleteMapping("/{id}")
    public void deleteMedcin(@PathVariable Long id) {
       medcinService.deleteMedcin(id);
    }





}

