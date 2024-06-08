package com.epi.cabinetsmedicaux.Controllers;

import com.epi.cabinetsmedicaux.model.RendezVous;
import com.epi.cabinetsmedicaux.services.RendezVousService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class RendezVousController {
    private final RendezVousService rendezVousService;

    public RendezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }



    @GetMapping
    public List<RendezVous> getAllRendezVous() {
        return rendezVousService.getAllRendezVous();
    }

    @GetMapping("/{id}")
    public Optional<RendezVous> getRendezVousById(@PathVariable Long id) {
        return rendezVousService.getRendezVousById(id);
    }

    @PostMapping("/saveRendezVous")
    public RendezVous saveRendezVous(@RequestBody RendezVous rendezVous) {
        return rendezVousService.saveRendezVous(rendezVous);
    }

    @DeleteMapping("/{id}")
    public void deleteRendezVous(@PathVariable Long id) {
        rendezVousService.deleteRendezVous(id);
    }


}

