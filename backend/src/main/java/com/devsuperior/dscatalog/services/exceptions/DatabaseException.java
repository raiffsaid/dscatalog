package com.devsuperior.dscatalog.services.exceptions;

public class DatabaseException extends RuntimeException {

    // Repassando o argumento para o construtor da super-classe
    public DatabaseException(String msg) {
        super(msg);
    }
}
