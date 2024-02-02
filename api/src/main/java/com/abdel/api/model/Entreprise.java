package com.abdel.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Entreprise")

public class Entreprise extends  AbstractEntity {

    @Column(name = "nom")
    private  String nom;

    @Column(name = "description")
    private String description;

     @Embedded
     private  Adresse adresse;


    @Column(name = "codeFiscal")
     private String codeFiscal;

    @Column(name = "image")
    private String image;

    @Column(name = "email")
    private String email;

    @Column(name = "siteWeb")
    private String siteWeb;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;


}
