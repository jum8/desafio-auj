package io.jum.desafio_au_j.rest;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResource {

    @Operation(summary = "Por qué deseo formar parte de los grupos de trabajo backend")
    @GetMapping("/")
    public String index() {
        return """
            Estoy interesado en formar parte de los grupos de trabajo backend, porque
            me gusta programar y, en particular, desarrollar backends.
            Y quiero adquirir experiencia en proyectos reales""";
    }

}
