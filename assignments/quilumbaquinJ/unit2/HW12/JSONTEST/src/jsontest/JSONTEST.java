/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jsontest;

import ec.edu.espe.JSONREADER.model.JSONREADER;
import java.io.IOException;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class JSONTEST {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        JSONREADER jread=new JSONREADER();
        jread.JsonReader("D:\\Documentos\\JAIRO\\PRIMERO\\POO\\CODIGO\\ESPE202205-OOP-SW-4680\\assignments\\quilumbaquinJ\\unit2\\HW12\\JSONTEST\\JSON_DATA");
        
    }
    
}
