/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arrays.view;

import ec.edu.espe.arrays.model.Person;

/**
 *
 * @author Widinson Caiza, DCCO- ESPE, BettaCoders
 */
public class Display {
    public static void main(String[] args) {
               
    Person[] people= new Person [5];
    people[0]=new Person (2,"danilo","OPP");
    people[1]=new Person (20,"Deri","EDO");
    people[2]=new Person (93,"ilo","VECTO");
    people[3]=new Person (53,"dan","OPP");
    people[4]=new Person (27,"Karla","OPP");
    
    for (int i=0;i<5;i++){
        System.out.println("Person("+(i+1)+")\t->"+people[i]);
    }
}}
