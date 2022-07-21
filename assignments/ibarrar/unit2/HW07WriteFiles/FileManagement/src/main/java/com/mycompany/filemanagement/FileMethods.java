package com.mycompany.filemanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronny Ibarra, DCCO- ESPE, SyntaxError
 */
public class FileMethods {
    //
    public void creaArchivo(String archivo){
        File fl = new File(archivo);
        
        PrintWriter pw;
        try {
            pw = new PrintWriter(fl);
            pw.printf("Hellow, My name is Ronny Ibarra" );
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
       
    }
}
