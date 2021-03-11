package com.example.demo;

public class ResourceNotFound extends Exception{
    private String name;
    private long id;
    private String field;

    public ResourceNotFound(String name, long id, String field) {
        super(name);
        this.name = name;
        this.id = id;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
