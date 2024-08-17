package io.jum.desafio_au_j.rest;

import io.jum.desafio_au_j.model.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class HomeResource {

    @Operation(summary = "Por qué deseo formar parte de los grupos de trabajo backend")
    @GetMapping("/")
    public ResponseEntity<SuccessResponse<String>> index(HttpServletRequest request) {
        String path = request.getRequestURI();
        String data = "Estoy interesado en formar parte de los grupos de trabajo backend, " +
                "porque me gusta programar y, en particular, desarrollar backends. " +
                "Y quiero adquirir experiencia en proyectos reales";

        SuccessResponse<String> response = SuccessResponse.<String>builder()
                .timestamp(LocalDateTime.now())
                .status(HttpStatus.OK.value())
                .data(data)
                .path(path)
                .build();

        return new  ResponseEntity<SuccessResponse<String>>(response, HttpStatus.OK);
    }

}
