package com.cristian.PrimerApi.services;

import com.cristian.PrimerApi.dtos.CalculateIMCinDTO;

public class IMCService implements IIMCService{

    @Override
    public float calculateIMC(CalculateIMCinDTO calculateIMCinDTO) {
        return calculateIMCinDTO.getWeight()/(calculateIMCinDTO.getHeight()*calculateIMCinDTO.getHeight());
    }
}
