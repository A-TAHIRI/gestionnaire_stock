package com.abdel.api.repository;

import com.tahiri.gestiondestock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente , Integer> {
}
