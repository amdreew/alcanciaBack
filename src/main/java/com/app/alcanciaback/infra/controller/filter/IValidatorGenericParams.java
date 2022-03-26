package com.app.alcanciaback.infra.controller.filter;


import com.app.alcanciaback.infra.controller.config.ApiResponse;
import org.springframework.validation.BindingResult;

import java.util.Map;

public interface IValidatorGenericParams {
    ApiResponse<Map<String, Object>> validateParams(BindingResult result);
}
