package com.app.alcanciaback.infra.controller;

import com.app.alcanciaback.infra.controller.config.ApiResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping()
public class WellcomeController {
    @GetMapping
    public ApiResponse<String> getAllDeniminations() {
        return new ApiResponse<>("esta es mi api ", null);
    }
}
