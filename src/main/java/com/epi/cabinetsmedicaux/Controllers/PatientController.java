package com.epi.cabinetsmedicaux.Controllers;

import com.epi.cabinetsmedicaux.model.Medcin;
import com.epi.cabinetsmedicaux.model.Patient;
import com.epi.cabinetsmedicaux.services.MedcinService;
import com.epi.cabinetsmedicaux.services.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class PatientController {

    private final PatientService patientService;

    public PatientController (PatientService patientService) {
        this.patientService = patientService;
    }


    @GetMapping
    public List<Patient> getAllpatients() {
        return patientService.getAllPatient();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping("/savePatient")
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
       patientService.deletePatient(id);
    }


}

