package com.abdel.api.service;


import com.tahiri.gestiondestock.repository.LigneCommandeFournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigneCommadeFournisseurSrvice {
    @Autowired
    private LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository;
}
