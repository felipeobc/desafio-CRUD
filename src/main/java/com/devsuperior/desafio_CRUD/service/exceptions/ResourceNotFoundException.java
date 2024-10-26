package com.devsuperior.desafio_CRUD.service.exceptions;



public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (String msg){
        super(msg);
    }
}
