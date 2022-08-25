/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class ClientApp {
    
    class ClientApp {
public static void main(String[] args) {
GUIFactory aFactory = GUIFactory.getFactory();
Button aButton = aFactory.createButton();
aButton.caption = "Play";
aButton.paint();
}
}
    
}
