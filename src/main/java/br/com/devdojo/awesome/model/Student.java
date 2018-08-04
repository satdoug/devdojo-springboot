package br.com.devdojo.awesome.model;

/**
 * Criado por douglas.santos em 31/07/2018
 */

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
