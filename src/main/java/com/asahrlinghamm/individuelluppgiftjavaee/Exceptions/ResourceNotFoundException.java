package com.asahrlinghamm.individuelluppgiftjavaee.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialversionUID = 1L;
    private String name;
    private String field;
    private Object value;


    public ResourceNotFoundException(String name, String field, Object value) {
        super(String.format("%s not found with %s : '%s'", name, field, value));
        this.name = name;
        this.field = field;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public Object getValue() {
        return value;
    }
}



