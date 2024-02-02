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
@Table(name = "CommandeClient")

public class CommandeClient extends  AbstractEntity {

    @Column(name = "reference")
    private  String reference;

    @Column(name = "dateCommande")
    private Instant dateCommande;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idclient")
    private  Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommadeClient> ligneCommadeClients;


}
