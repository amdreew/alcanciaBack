package com.app.alcanciaback.domain.exception;

public class RequiredValueException extends RuntimeException {

    public RequiredValueException(String msj) {
        super(msj);
    }
}
