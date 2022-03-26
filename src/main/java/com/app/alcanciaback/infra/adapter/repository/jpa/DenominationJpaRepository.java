package com.app.alcanciaback.infra.adapter.repository.jpa;

import com.app.alcanciaback.infra.adapter.repository.entity.Denominationentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenominationJpaRepository extends JpaRepository<Denominationentity, Long> {
}
