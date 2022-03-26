package com.app.alcanciaback.app.mapper;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.domain.model.Denomination;
import com.app.alcanciaback.infra.adapter.repository.entity.Denominationentity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DenominationAppMapper {

    Denomination denominationDTOToDenomination(DenominationDTO denominationDTO);
    DenominationDTO denominationTodenominationDTO(Denomination denomination);
}
