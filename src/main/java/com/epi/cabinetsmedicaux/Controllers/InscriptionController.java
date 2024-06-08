package com.epi.cabinetsmedicaux.Controllers;

import com.epi.cabinetsmedicaux.model.Inscription;
import com.epi.cabinetsmedicaux.repository.MedcinRepository;
import com.epi.cabinetsmedicaux.repository.PatientRepository;
import com.epi.cabinetsmedicaux.services.InscriptionService;
import com.epi.cabinetsmedicaux.services.SecretaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/inscription")
@CrossOrigin(origins = "http://localhost:4200")
public class InscriptionController {


    @Autowired
    private InscriptionService inscriptionService;


    public InscriptionController
            (InscriptionService inscriptionService ){
        this.inscriptionService=inscriptionService ;
    }

    @PostMapping("/registre")
    public ResponseEntity<String> inscrireUtilisateur(@RequestBody Inscription inscription) {
        inscriptionService.inscrireUtilisateur(inscription);
        return ResponseEntity.ok("Inscription réussie.");
    } }
