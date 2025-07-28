package com.estudos.gestok.controller;

import com.estudos.gestok.dto.AmbienteDTO;
import com.estudos.gestok.service.AmbienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ambientes")
public class AmbienteController {

    private final AmbienteService ambienteService;

    @Autowired
    public AmbienteController(AmbienteService ambienteService) {
        this.ambienteService = ambienteService;
    }

//    @PostMapping //criação de Ambientes
//    public AmbienteDTO
}
