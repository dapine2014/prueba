package com.fonyou.prueba.prueba.utils;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Responce {
    private Object succes;
    private String message;
    private Object data;
}
