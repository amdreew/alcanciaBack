package com.app.alcanciaback.infra.controller.filter;


import com.app.alcanciaback.infra.controller.config.ApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ValidatorGenericParams implements IValidatorGenericParams {
    @Override
    public ApiResponse<Map<String, Object>> validateParams(BindingResult result) {
        Map<String, Object> response = new HashMap<>();
        if (result.hasErrors()){
            List<String> error = result.getFieldErrors()
                    .stream()
                    .map(err -> "El campo '"+ err.getField() +"' "+ err.getDefaultMessage()
                    )
                    .collect(Collectors.toList());
            response.put("error", error);
            return new ApiResponse<>(response, null);
        } else {
            return null;
        }
    }
}
