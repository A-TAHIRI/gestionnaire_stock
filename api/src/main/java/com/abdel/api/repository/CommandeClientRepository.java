package com.abdel.api.repository;

import com.tahiri.gestiondestock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {
}
