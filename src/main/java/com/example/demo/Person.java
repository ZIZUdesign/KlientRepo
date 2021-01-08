package com.example.demo;

public class Person {

    private String navn;
    private int Id;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Person (String navn, int id ){

        this.navn=navn;
        this.Id= id;
    }




}
