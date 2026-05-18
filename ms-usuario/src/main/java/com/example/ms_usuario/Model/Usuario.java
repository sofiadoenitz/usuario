package com.example.ms_usuario.Model;

import com.example.ms_usuario.DTO.AmigosDTO;
import com.example.ms_usuario.DTO.BibliotecaDTO;
import com.example.ms_usuario.DTO.NotificacionDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String correo;
    private boolean activo;

    private BibliotecaDTO biblioteca;
    private AmigosDTO amigos;
    private NotificacionDTO notificacion;

}
