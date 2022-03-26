package com.app.alcanciaback.infra.adapter.repository.mapper;

import com.app.alcanciaback.domain.model.Denomination;
import com.app.alcanciaback.infra.adapter.repository.entity.Denominationentity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DenominationMapper {

    Denomination denominationEntityToDenomination(Denominationentity denominationentity);
    Denominationentity denominationTodenominationEntity(Denomination denomination);
}
