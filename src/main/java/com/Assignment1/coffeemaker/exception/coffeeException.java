package com.Assignment1.coffeemaker.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class coffeeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public coffeeException(String message) {
        super(message);
    }


}

