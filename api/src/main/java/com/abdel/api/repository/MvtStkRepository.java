package com.abdel.api.repository;


import com.tahiri.gestiondestock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvtStkRepository  extends JpaRepository<MvtStk ,Integer> {
}
