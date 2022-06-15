/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.poo.workshop_13.model;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "El nombre es: =" + name + ", su edad; =" + age + '}';
    }

    
    /**
     * @return the name
     */
    private String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    private int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    private void setAge(int age) {
        this.age = age;
    }
    
}
