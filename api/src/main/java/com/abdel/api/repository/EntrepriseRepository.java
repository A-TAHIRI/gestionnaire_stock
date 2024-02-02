package com.abdel.api.repository;

import com.tahiri.gestiondestock.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {
}
