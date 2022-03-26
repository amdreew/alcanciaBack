package com.app.alcanciaback.app.services;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.app.dto.PiggyBankDTO;
import com.app.alcanciaback.app.mapper.DenominationAppMapper;
import com.app.alcanciaback.app.mapper.PiggyBankAppMapper;
import com.app.alcanciaback.app.port.DenominationAppPort;
import com.app.alcanciaback.app.port.PiggyBankAppPort;
import com.app.alcanciaback.domain.exception.RequiredValueException;
import com.app.alcanciaback.domain.model.PiggyBank;
import com.app.alcanciaback.domain.services.PiggyBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PiggyBankAppService implements PiggyBankAppPort {

    @Autowired
    private PiggyBankService service;
    @Autowired
    private PiggyBankAppMapper mapper;
    @Autowired
    private DenominationAppMapper denominationAppMapper;
    @Autowired
    private DenominationAppPort denominationAppPort;

    @Override
    public PiggyBankDTO save(Long idDenomination) {
        if(idDenomination != null) {
            final DenominationDTO denominationDTO = this.denominationAppPort.findById(idDenomination);
            if(denominationDTO != null) {
                final PiggyBank piggyBankCurrentDb = this.mapper.piggyBankDTOToPiggyBank(this.findByDenomination(denominationDTO));
                if (piggyBankCurrentDb != null) {
                    piggyBankCurrentDb.setAmount(piggyBankCurrentDb.getAmount() + 1);
                    this.service.save(piggyBankCurrentDb);
                    return mapper.PiggyBankToPiggyBankDTO(piggyBankCurrentDb);
                } else {
                    throw new RequiredValueException("no se encontro un registro asociado al id");
                }
            } else {
                throw new RequiredValueException("la denominacion no existe");
            }

        } else {
            throw new RequiredValueException("el id es obligatorio");
        }
    }

    @Override
    public List<PiggyBankDTO> getAll() {
        return this.service.getAll()
                .stream()
                .map(mapper::PiggyBankToPiggyBankDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAll() {
        final List<PiggyBankDTO> piggyBankDTOList = this.getAll();
        piggyBankDTOList.forEach(item -> {
            item.setAmount(0);
            service.save(mapper.piggyBankDTOToPiggyBank(item));
        });
    }

    @Override
    public PiggyBankDTO findByDenomination(DenominationDTO denomination) {
        return this.mapper.PiggyBankToPiggyBankDTO(this.service.findByDenomination(this.denominationAppMapper.denominationDTOToDenomination(denomination)));
    }
}
