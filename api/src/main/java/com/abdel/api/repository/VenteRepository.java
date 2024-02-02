package com.abdel.api.repository;

import com.tahiri.gestiondestock.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenteRepository  extends JpaRepository<Vente , Integer> {
}
