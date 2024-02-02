package com.abdel.api.service;


import com.tahiri.gestiondestock.repository.LigneCommandeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigneCommadeClientService {
    @Autowired
    private LigneCommandeClientRepository ligneCommandeClientRepository;
}
