package com.devsuperior.dscatalog.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    // Repassando o argumento para o construtor da super-classe
    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
