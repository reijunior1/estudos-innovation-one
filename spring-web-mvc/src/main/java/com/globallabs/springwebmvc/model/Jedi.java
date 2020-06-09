package com.globallabs.springwebmvc.model;

public class Jedi {
    private String name;
    private String lastname;

    public Jedi (final String name, final String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Jedi () {

    }

    public String getName () {
        return name;
    }

    public void setName (final String name) {
        this.name = name;
    }

    public String getLastName () {
        return lastname;
    }

    public void setLastName (final String lastName) {
        this.lastname = lastname;
    }

}