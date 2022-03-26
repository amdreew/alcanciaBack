package com.app.alcanciaback.domain.port;

import com.app.alcanciaback.domain.model.PiggyBank;

import java.util.List;

public interface PiggyBankPort {
    PiggyBank save(PiggyBank piggyBank);
    PiggyBank findById(Long id);
    List<PiggyBank> getAll();
    void deleteAll();
}
