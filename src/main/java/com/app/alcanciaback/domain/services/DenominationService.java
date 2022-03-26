package com.app.alcanciaback.domain.services;

import com.app.alcanciaback.domain.model.Denomination;
import com.app.alcanciaback.domain.port.DenominationPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DenominationService {
    @Autowired
    private DenominationPort port;

    public Denomination save(Denomination denomination){
        return this.port.save(denomination);
    }

    public List<Denomination> getAll() {
        return this.port.getAll();
    }

    public Denomination findById(Long id) {
        return this.port.findById(id);
    }

}
