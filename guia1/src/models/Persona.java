package models;

import java.util.UUID;

public class Persona {
    private String id;
    private String name;
    private String lastName;
    private Integer age;

    public Persona(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public Persona name(String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persona lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Persona age(int age){
        this.age = age;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void imprimir() {
        System.out.println("Id..........: " + id);
        System.out.println("Name........: " + name);
        System.out.println("Last Name...: " + lastName);
        System.out.println("Age.........: " + age);
        System.out.println("______________________________________________");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
