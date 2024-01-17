package com.fonyou.prueba.prueba.application.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.fonyou.prueba.prueba.model.Prueba}
 */
@Value
public class PruebaDto implements Serializable {
    Long id;
    String nombre;
    String objetivo;
    String comentario;
}