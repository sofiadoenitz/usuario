package com.example.ms_usuario.DTO;

import lombok.Data;

@Data
public class NotificacionDTO {
    
    private Long id;
    private String mensaje;
    private boolean leida;

}
