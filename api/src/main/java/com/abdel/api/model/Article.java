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
@Table(name = "Article")

public class Article extends  AbstractEntity{

    @Column(name = "codeArticle")
    private  String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name = "prixUnitaireHt")
    private double prixUnitaireHt;

    @Column(name = "touxTva")
    private  double touxTva;

    @Column(name = "prixUnitaireTtc")
    private  double prixUnitaireTtc;

    @Column(name = "image")
    private  String image;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    private  Categorie categorie;

    @OneToMany(mappedBy = "article")
    private List<LigneCommadeClient>  ligneCommadeClients;

    @OneToMany(mappedBy = "article")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;


    @OneToMany(mappedBy = "article")
    private List<LigneVente> ligneVentes;

    @OneToMany(mappedBy = "article")
    private List<MvtStk> mvtStks;






}
