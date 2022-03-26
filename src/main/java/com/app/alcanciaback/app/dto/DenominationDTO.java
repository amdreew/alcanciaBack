package com.app.alcanciaback.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DenominationDTO {
    private Long id;
    private Integer value;
    private String description;
}
