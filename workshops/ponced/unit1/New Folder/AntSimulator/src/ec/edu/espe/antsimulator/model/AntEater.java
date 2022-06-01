/*
System.out.println(
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, Dev's Developers
 */
public class AntEater {
    Cell position;
    int antEaterCounter;
    int runCounter;
    int state;
    
    public void run (){
        System.out.println("AntEater is running");
    }

    public AntEater(Cell position, int antEaterCounter, int runCounter, int state) {
        this.position = position;
        this.antEaterCounter = antEaterCounter;
        this.runCounter = runCounter;
        this.state = state;
    }
    
}
