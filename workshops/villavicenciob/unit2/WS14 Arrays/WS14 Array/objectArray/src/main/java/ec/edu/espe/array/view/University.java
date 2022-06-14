/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.array.view;

import ec.edu.espe.array.model.Person;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class University {
    public static void main (String[] args){
        Person person[]=new Person[5];
        
        
        
        person[0]=new Person(1,"Steven Pozo","OOP");
        person[1]=new Person(2,"Francisco Perez","OOP");
        person[2]=new Person(3,"Mateo Sosa","OOP");
        person[3]=new Person(3,"Juanito Alcachofa","OOP");
        person[4]=new Person(3,"Mama Coco","OOP");
        
        for(int i=0;i<5;i++){
            System.out.println(person[i]);
        }
    }
}
