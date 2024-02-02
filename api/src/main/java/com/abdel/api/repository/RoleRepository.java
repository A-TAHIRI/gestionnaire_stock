package com.abdel.api.repository;

import com.tahiri.gestiondestock.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository  extends JpaRepository<Role , Integer> {
}
