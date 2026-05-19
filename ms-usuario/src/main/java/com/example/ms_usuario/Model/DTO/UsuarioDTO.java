package com.example.ms_usuario.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String usuario;
    private String correo;
    private boolean activo;

    private BibliotecaDTO biblioteca;
    private AmigosDTO amigos;
    private NotificacionDTO notificacion;
}
