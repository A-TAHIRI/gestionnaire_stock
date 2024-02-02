package com.abdel.api.service;


import com.tahiri.gestiondestock.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;
}
