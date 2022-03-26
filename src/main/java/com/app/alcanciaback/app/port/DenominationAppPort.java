package com.app.alcanciaback.app.port;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.domain.model.Denomination;

import java.util.List;

public interface DenominationAppPort {
    DenominationDTO save(DenominationDTO denomination);
    List<DenominationDTO> getAll();
}
