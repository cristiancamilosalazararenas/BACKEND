package com.cristian.PrimerApi.controllers;

import com.cristian.PrimerApi.dtos.SaludarPersonainDTO;
import com.cristian.PrimerApi.dtos.SaludoPersonaOutDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SaludoController")
public class SaludoController {

    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable("nombre") String nombre){
        return "Hola" + nombre;
    }

    @GetMapping("/bienvenida")
    public String saludar2(@RequestParam("nombre") String nombre){
        return "Bienvenido " + nombre;
    }

    @PostMapping("/SaludarConPost")
    public ResponseEntity<SaludoPersonaOutDTO> saludarConPost(@RequestBody SaludarPersonainDTO saludarPersonainDTO){
        String mensaje = "Hola %s %s".formatted(saludarPersonainDTO.getNombre(), saludarPersonainDTO.getApellido());
        SaludoPersonaOutDTO respuesta = new SaludoPersonaOutDTO(mensaje);
        return ResponseEntity.ok(respuesta);
    }

}
