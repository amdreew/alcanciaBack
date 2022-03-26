package com.app.alcanciaback.app.services;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.app.mapper.DenominationAppMapper;
import com.app.alcanciaback.app.port.DenominationAppPort;
import com.app.alcanciaback.domain.services.DenominationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DenominationAppService implements DenominationAppPort {

    @Autowired
    private DenominationService service;
    @Autowired
    private DenominationAppMapper mapper;

    @Override
    @Transactional
    public DenominationDTO save(DenominationDTO denomination) {
        return mapper.denominationTodenominationDTO(this.service.save(mapper.denominationDTOToDenomination(denomination)));
    }

    @Override
    @Transactional
    public List<DenominationDTO> getAll() {
        return service.getAll()
                .stream()
                .map(mapper::denominationTodenominationDTO)
                .collect(Collectors.toList());
    }
}
