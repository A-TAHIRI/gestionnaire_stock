package com.abdel.api.service;

import com.tahiri.gestiondestock.repository.CommandeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeClientService {


    @Autowired
    private CommandeClientRepository commandeClientRepository;
}
