/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw27desingpatterns.abstractpatter;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class ClientApp {
    public static void main(String[]args){
}
     GUIFactory aFactory= GUIFactory.getFactory();
     Button aButton=aFactory.createButton();
     aButton.caption="Play";
     aButton.paint();
}
