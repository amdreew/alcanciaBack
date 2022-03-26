package com.app.alcanciaback.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PiggyBankDTO {
    private Long id;
    private DenominationDTO denomination;
    private Integer amount;
}
