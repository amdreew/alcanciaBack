package com.app.alcanciaback.infra.adapter.repository.bank;

import com.app.alcanciaback.domain.model.PiggyBank;
import com.app.alcanciaback.domain.port.PiggyBankPort;
import com.app.alcanciaback.infra.adapter.repository.jpa.PiggyBankJpaRepository;
import com.app.alcanciaback.infra.adapter.repository.mapper.PiggyBankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PiggyBankRepository implements PiggyBankPort {

    @Autowired
    private PiggyBankJpaRepository repository;

    @Autowired
    private PiggyBankMapper mapper;

    @Override
    public PiggyBank save(PiggyBank piggyBank) {
        return this.mapper.piggyBankEntityToPiggyBank(this.repository.save(this.mapper.PiggyBankToPiggyBankEntity(piggyBank)));
    }

    @Override
    public PiggyBank findById(Long id) {
        return this.mapper.piggyBankEntityToPiggyBank(this.repository.findById(id).orElse(null));
    }

    @Override
    public List<PiggyBank> getAll() {
        return this.repository.findAll()
                .stream()
                .map(mapper::piggyBankEntityToPiggyBank)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAll() {
        this.repository.deleteAll();
    }
}
