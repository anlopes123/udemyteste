package br.com.anlopes.api.exceptions;

public class ObjectNotFoundException extends  RuntimeException{

    public ObjectNotFoundException(String message) {
        super(message);
    }
}