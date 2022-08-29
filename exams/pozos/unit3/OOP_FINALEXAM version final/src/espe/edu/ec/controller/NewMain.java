/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espe.edu.ec.controller;

import espe.edu.ec.model.elements;
import utils.FormsHandler;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormsHandler frms;
        frms= new FormsHandler();
        elements elm;
        elm= new elements();
        int unsorted[]={1,2,3,4};
        int sorted[]={7,8,9,6,1};
        
        elm.setSize(7);
        elm.setSortAlgorithm("somehi");
        elm.setUnsorted(unsorted);
        elm.setSorted(sorted);
        
        frms.saveElementsToDB(elm);
        
    }
    
}
