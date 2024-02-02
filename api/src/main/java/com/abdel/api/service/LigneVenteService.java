package com.abdel.api.service;

import com.tahiri.gestiondestock.repository.LigneVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigneVenteService {
    @Autowired
    private LigneVenteRepository ligneVenteRepository;
}
