package com.cristian.PrimerApi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaludarPersonainDTO {
    private String nombre;
    private String apellido;
}
