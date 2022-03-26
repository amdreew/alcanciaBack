package com.app.alcanciaback.infra.controller;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.app.dto.PiggyBankDTO;
import com.app.alcanciaback.app.port.PiggyBankAppPort;
import com.app.alcanciaback.infra.controller.config.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/bank")
public class PiggyBankController {

    @Autowired
    private PiggyBankAppPort port;

    @GetMapping
    public ApiResponse<List<PiggyBankDTO>> getStatusBank() {
        return new ApiResponse<>(port.getAll(), null);
    }

    @PutMapping
    public ApiResponse<PiggyBankDTO> update(@RequestBody DenominationDTO denominationDTO) {
        return new ApiResponse<>(port.save(denominationDTO.getId()), null);
    }

    @DeleteMapping
    public ApiResponse<String> delete() {
        port.deleteAll();
        return new ApiResponse<>("se limpio la alcancia", null);
    }
}
