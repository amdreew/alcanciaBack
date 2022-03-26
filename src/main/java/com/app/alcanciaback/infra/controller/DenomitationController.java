package com.app.alcanciaback.infra.controller;

import com.app.alcanciaback.app.dto.DenominationDTO;
import com.app.alcanciaback.app.port.DenominationAppPort;
import com.app.alcanciaback.infra.controller.config.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/denomination")
public class DenomitationController {

    @Autowired
    private DenominationAppPort port;

    @GetMapping
    public ApiResponse<List<DenominationDTO>> getAllDeniminations() {
        return new ApiResponse<>(this.port.getAll(), null);
    }

    @PostMapping
    public ApiResponse<DenominationDTO> saveDenimination(@RequestBody DenominationDTO denominationDTO) {
        return new ApiResponse<>(this.port.save(denominationDTO), null);
    }
}
