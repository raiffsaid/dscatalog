package com.devsuperior.dscatalog.services.exceptions;

public class EntityNotFoundException extends RuntimeException {

    // Repassando o argumento para o construtor da super-classe
    public EntityNotFoundException(String msg) {
        super(msg);
    }

}
