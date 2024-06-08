package com.epi.cabinetsmedicaux.Controllers;

import com.epi.cabinetsmedicaux.model.Secretaire;
import com.epi.cabinetsmedicaux.services.SecretaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class SecretaireController {private SecretaireService secretaireService;

    public void secretaireController(SecretaireService secretaireService) {
        this.secretaireService= secretaireService;
    }


    @GetMapping
    public List<Secretaire> getAllSecretaires() {
        return secretaireService.getAllSecretaire();
    }

    @GetMapping("/{id}")
    public Optional<Secretaire> getSecretaireById(@PathVariable Long id) {
        return secretaireService.getSecretaireById(id);
    }

    @PostMapping("/saveSecretaire")
    public Secretaire saveSecretaire(@RequestBody Secretaire secretaire) {
        return secretaireService.saveSecretaire(secretaire);
    }

    @DeleteMapping("/{id}")
    public void deleteSecretaire(@PathVariable Long id) {
        secretaireService.deleteSecretaire(id);
    }


}
