package com.abdel.api.service;

import com.tahiri.gestiondestock.repository.CommandeFournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeFournisseurService {

    @Autowired
    private CommandeFournisseurRepository commandeFournisseurRepository;
}
