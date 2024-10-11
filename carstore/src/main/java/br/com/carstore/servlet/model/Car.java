package br.com.carstore.servlet.model;

public class Car {
    private String name;
    private String color;

    public Car(String nome, String color) {
        this.name = nome;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
