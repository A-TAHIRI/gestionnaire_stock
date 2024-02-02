package com.abdel.api.service;

import com.tahiri.gestiondestock.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
}
