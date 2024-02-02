package com.abdel.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "Categorie")
public class Categorie extends  AbstractEntity {

    @Column(name = "code")
    private  String code;

    @Column(name = "designation")
    private  String designation;


    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "categorie")
    private List<Article> articles;

}
