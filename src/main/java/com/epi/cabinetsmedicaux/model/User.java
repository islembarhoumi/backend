package com.epi.cabinetsmedicaux.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)//  Les attributs hérités sont répétés dans chaque table.
//@DiscriminatorColumn(name = "usertype")//
@Getter
@Setter
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String telephone;
    private String adresse;
    private String email;
    private String password;


    public User(String nom, String prenom, String telephone, String adresse, String email,  String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.password = password;
    }

    public User() {

    }


    public void hashPassword() {
        this.password = new BCryptPasswordEncoder().encode(this.password);
    }
    // Getters and setters for private fields (not shown in your provided code)

}
