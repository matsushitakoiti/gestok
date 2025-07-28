package com.estudos.gestok.service;

import com.estudos.gestok.repository.AmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AmbienteService {

    private final AmbienteRepository ambienteRepository;

    @Autowired
    public AmbienteService(AmbienteRepository ambienteRepository) {
        this.ambienteRepository = ambienteRepository;
    }
}
