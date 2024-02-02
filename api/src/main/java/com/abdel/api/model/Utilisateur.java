package com.abdel.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Entity

@Data

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Utilisateur")

public class Utilisateur extends  AbstractEntity{
    @Column(name = "nom")
    private  String nom;

    @Column(name = "prenom")
    private  String prenom;

    @Embedded
    private  Adresse adresse;

    @Column(name = "photo")
    private  String photo;

    @Column(name = "mail")
    private  String mail;

    @Column(name = "numTel")
    private  String numTel;

    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;

    @Column(name = "motdepasse")
    private String moteDePasse;



    @ManyToOne
    @JoinColumn(name = "identreprise")
    private  Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;

}
