package com.app.alcanciaback.domain.port;

import com.app.alcanciaback.domain.model.Denomination;

import java.util.List;

public interface DenominationPort {
    Denomination save(Denomination denomination);
    Denomination findById(Long id);
    List<Denomination> getAll();
}
