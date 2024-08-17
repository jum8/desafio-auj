package io.jum.desafio_au_j.model;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessResponse<T> {
    private LocalDateTime timestamp;
    private int status;
    private T data;
    private String path;

}
