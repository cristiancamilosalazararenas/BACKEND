package com.cristian.PrimerApi.controllers;

import com.cristian.PrimerApi.dtos.CalculateIMCinDTO;
import com.cristian.PrimerApi.dtos.CalculateIMCoutDTO;
import com.cristian.PrimerApi.services.IIMCService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class IMCController {

    private IIMCService iimcService;

    public IMCController(IIMCService iimcService){
        this.iimcService = iimcService;
    }

    @PostMapping
    public ResponseEntity<CalculateIMCoutDTO> calculateIMC(@RequestBody CalculateIMCinDTO calculateIMCinDTO){
        if (calculateIMCinDTO.getWeight() == 0 || calculateIMCinDTO.getHeight() == 0){
            return ResponseEntity.badRequest().body(new CalculateIMCoutDTO("Culpa de Petro"));
        }
        return ResponseEntity.ok(new CalculateIMCoutDTO("IMC Calculado: %s".formatted(iimcService.calculateIMC(calculateIMCinDTO))));
    }
}
