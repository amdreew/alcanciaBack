package com.app.alcanciaback.infra.adapter.repository.jpa;

import com.app.alcanciaback.infra.adapter.repository.entity.PiggyBankEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PiggyBankJpaRepository extends JpaRepository<PiggyBankEntity, Long> {
}
