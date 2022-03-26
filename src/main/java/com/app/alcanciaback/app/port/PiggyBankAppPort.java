package com.app.alcanciaback.app.port;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.app.dto.PiggyBankDTO;

import java.util.List;

public interface PiggyBankAppPort {
    PiggyBankDTO save(Long idDenomination);
    List<PiggyBankDTO> getAll();
    void deleteAll();
    PiggyBankDTO findByDenomination(DenominationDTO denomination);
}
