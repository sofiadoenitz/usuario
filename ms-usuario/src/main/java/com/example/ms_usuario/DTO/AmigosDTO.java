package com.example.ms_usuario.DTO;

import lombok.Data;

@Data
public class AmigosDTO {
    
    private Long id;
    private Long usuarioId;
    private Long amigoId;
    private String estado;
}
