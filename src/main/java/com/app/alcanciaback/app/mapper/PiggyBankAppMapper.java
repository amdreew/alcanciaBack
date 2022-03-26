package com.app.alcanciaback.app.mapper;

import com.app.alcanciaback.app.dto.PiggyBankDTO;
import com.app.alcanciaback.domain.model.PiggyBank;
import com.app.alcanciaback.infra.adapter.repository.entity.PiggyBankEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PiggyBankAppMapper {
    PiggyBankDTO PiggyBankToPiggyBankDTO(PiggyBank piggyBank);
    PiggyBank piggyBankDTOToPiggyBank(PiggyBankDTO piggyBank);
}
