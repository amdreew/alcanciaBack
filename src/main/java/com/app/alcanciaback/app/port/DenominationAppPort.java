package com.app.alcanciaback.app.port;

import com.app.alcanciaback.app.dto.DenominationDTO;

import java.util.List;

public interface DenominationAppPort {
    DenominationDTO save(DenominationDTO denomination);
    DenominationDTO findById(Long id);
    List<DenominationDTO> getAll();
}
