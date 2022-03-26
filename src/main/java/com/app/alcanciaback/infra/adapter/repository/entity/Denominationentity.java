package com.app.alcanciaback.infra.adapter.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "denomination")
public class Denominationentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "el valor no puede ser nulo")
    private Integer value;
    @NotNull(message = "la descripcion no puede ser nula")
    @NotEmpty(message = "la descripcion no puede se vacia")
    private String description;
}
