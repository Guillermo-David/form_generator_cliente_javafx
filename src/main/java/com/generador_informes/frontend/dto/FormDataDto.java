package com.generador_informes.frontend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FormDataDto {
    private String nombre;
    private String email;
    private String tipoInforme;
    private String comentario;

}
