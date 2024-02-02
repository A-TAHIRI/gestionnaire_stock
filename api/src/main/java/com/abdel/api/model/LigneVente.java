package com.abdel.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "LigneVente")

public class LigneVente extends AbstractEntity {


    @Column(name = "quantite")
    private Long quantite;

    @Column(name = "prixUnitaire")
    private double prixUnitaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;


    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

}
