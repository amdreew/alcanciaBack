package com.app.alcanciaback.domain.services;

import com.app.alcanciaback.domain.model.PiggyBank;
import com.app.alcanciaback.domain.port.PiggyBankPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PiggyBankService {
    @Autowired
    private PiggyBankPort port;

    public PiggyBank save(PiggyBank piggyBank) {
        return this.port.save(piggyBank);
    }

    public List<PiggyBank> getAll() {
        return this.port.getAll();
    }

    public void deleteAll() {
        this.port.deleteAll();
    }

    public PiggyBank findById(Long id) {
        return this.port.findById(id);
    }
}
