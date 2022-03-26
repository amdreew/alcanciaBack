package com.app.alcanciaback.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PiggyBank {
    private Long id;
    private Denomination denomination;
    private Integer amount;
}
