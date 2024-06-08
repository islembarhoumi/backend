package com.epi.cabinetsmedicaux.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@AllArgsConstructor

public class Inscription {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String password;
    private String adresse;
    private String role;
    private int experience;
    private String maladie;
    private String allergie ;
    private String specialite;
    private int anneeExperience;



}
