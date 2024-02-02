package com.abdel.api.repository;

import com.tahiri.gestiondestock.model.LigneCommadeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigneCommandeClientRepository extends JpaRepository<LigneCommadeClient, Integer> {
}
