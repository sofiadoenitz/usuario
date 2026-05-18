package com.example.ms_usuario.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.ms_usuario.DTO.NotificacionDTO;

@FeignClient(
    name = "Notificacion",
    url = "http://localhost:8090"
)
public interface NotificacionFeignClient {
    @GetMapping("/api/v1/notificacion/usuario/{id}")
    NotificacionDTO obtenerNotificacion(@PathVariable Long id);
}
