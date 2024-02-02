package com.abdel.api.service;

import com.tahiri.gestiondestock.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseService {
    @Autowired
    private EntrepriseRepository entrepriseRepository;
}
