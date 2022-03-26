package com.app.alcanciaback.infra.adapter.repository.mapper;

import com.app.alcanciaback.domain.model.PiggyBank;
import com.app.alcanciaback.infra.adapter.repository.entity.PiggyBankEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PiggyBankMapper {
    PiggyBankEntity PiggyBankToPiggyBankEntity(PiggyBank piggyBank);
    PiggyBank piggyBankEntityToPiggyBank(PiggyBankEntity piggyBank);
}
