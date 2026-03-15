package com.cristian.PrimerApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
// A qué tabla esta apuntando con nombre "Rol".
@Table(name="rol")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol {
    //Wrappers (son datos primitivos con métodos)
    @Id // Para cuando es una llave simple
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que id es una columna autoincrementable
    @Column(name="id")
    private Long id;
    @Column(name="nombre", nullable = false, unique = true, length = 50)
    private String nombre;
}
