package com.app.alcanciaback.app.port;

import com.app.alcanciaback.app.dto.PiggyBankDTO;
import com.app.alcanciaback.domain.model.PiggyBank;

import java.util.List;

public interface PiggyBankAppPort {
    PiggyBankDTO save(PiggyBankDTO piggyBank);
    List<PiggyBankDTO> getAll();
    void deleteAll();
}
