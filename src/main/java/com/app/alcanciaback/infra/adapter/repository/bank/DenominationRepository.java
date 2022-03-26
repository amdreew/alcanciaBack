package com.app.alcanciaback.infra.adapter.repository.bank;

import com.app.alcanciaback.domain.model.Denomination;
import com.app.alcanciaback.domain.port.DenominationPort;
import com.app.alcanciaback.infra.adapter.repository.jpa.DenominationJpaRepository;
import com.app.alcanciaback.infra.adapter.repository.mapper.DenominationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DenominationRepository implements DenominationPort {

    @Autowired
    private DenominationJpaRepository jpaRepository;
    @Autowired
    private DenominationMapper denominationMapper;


    @Override
    public Denomination save(Denomination denomination) {
        return denominationMapper
                .denominationEntityToDenomination(jpaRepository.save(denominationMapper.denominationTodenominationEntity(denomination)));
    }

    @Override
    public List<Denomination> getAll() {
        return jpaRepository.findAll()
                .stream()
                .map(denominationMapper::denominationEntityToDenomination)
                .collect(Collectors.toList());
    }
}
