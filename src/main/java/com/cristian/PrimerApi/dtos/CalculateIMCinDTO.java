package com.cristian.PrimerApi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculateIMCinDTO {
    private float height;
    private float weight;
}
