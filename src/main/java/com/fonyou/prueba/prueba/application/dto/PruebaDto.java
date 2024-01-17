package com.fonyou.prueba.prueba.application.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.fonyou.prueba.prueba.model.Prueba}
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PruebaDto {
    private Long id;

    @NonNull
    private String nombre;

    private String objetivo;

    private String comentario;
}