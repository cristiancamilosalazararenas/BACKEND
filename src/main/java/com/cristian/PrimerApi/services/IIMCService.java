package com.cristian.PrimerApi.services;

import com.cristian.PrimerApi.dtos.CalculateIMCinDTO;

public interface IIMCService {
    float calculateIMC(CalculateIMCinDTO calculateIMCinDTO);
}
