/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.utils.json;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class Person {
    private int id;
    private String name;
    private String course;

    public Person(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Person() {
    }

    
    @Override
    public String toString() {
        return "Person\n" + "id = " + id + ", Name = " + name + ", Course = " + course + "\n";
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }
    
    
}
