package com.abdel.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Data

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MvtStk")

public class MvtStk extends AbstractEntity {


    @Column(name = "dateMvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private Long quantite;

    @Column(name = "typeMvt")
    private TypeMvtStk typeMvt;

    @Column(name = "sourcemvt")
    @Enumerated(EnumType.STRING)
    private SourceMvtStk sourceMvt;

    @Column(name = "identreprise")
    private Integer idEntreprise;


    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
}
